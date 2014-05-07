import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.*;

public class CucumberModule extends AbstractModule {

    private static int PORT = 3333;

    private TestServer testServer = testServer(PORT, fakeApplication(inMemoryDatabase()));
    private TestBrowser testBrowser = testBrowser(HTMLUNIT, PORT);

    @Override
    protected void configure() {
        bind(TestBrowser.class).toInstance(testBrowser);
        bind(TestServer.class).toInstance(testServer);
        bind(Integer.class).annotatedWith(Names.named("PORT")).toInstance(PORT);
    }
}