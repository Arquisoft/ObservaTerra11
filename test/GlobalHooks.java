import com.google.inject.Inject;
import cucumber.api.java.Before;
import play.test.TestBrowser;
import play.test.TestServer;

import static play.test.Helpers.*;

public class GlobalHooks {

    @Inject
    private TestBrowser testBrowser;

    @Inject
    private TestServer testServer;

    private static boolean initialised = false;

    @Before
    public void before() {
        if (!initialised) {
            start(testServer);
            initialised = true;

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    testBrowser.quit();
                    testServer.stop();
                }
            });
        }
    }

}