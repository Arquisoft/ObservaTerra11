package web;
import static org.fest.assertions.Assertions.assertThat;
import play.test.TestBrowser;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class WebSteps {

    @Inject
    private TestBrowser testBrowser;

    @Inject
    @Named("PORT")
    private Integer port;

    @Dado("^que tengo arrancada la aplicación$")
    public void que_tengo_arrancada_la_aplicación() throws Throwable {
    }

    @Cuando("^voy a la página principal$")
    public void voy_a_la_página_principal() throws Throwable {
        testBrowser.goTo("http://localhost:" + port);
    }

    @Entonces("^el título es (.+)$")
    public void el_título_es(String title) throws Throwable {
        assertThat(testBrowser.title()).isEqualTo(title);
    }


}