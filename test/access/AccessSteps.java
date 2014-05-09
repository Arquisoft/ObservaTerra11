package access;

import static org.fest.assertions.Assertions.assertThat;
import play.test.TestBrowser;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import controllers.Login;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class AccessSteps {

	@Inject
	private TestBrowser testBrowser;

	@Inject
	@Named("PORT")
	private Integer port;

	@Dado("^que estoy en la pagina principal$")
	public void que_estoy_en_la_pagina_principal() throws Throwable {
		testBrowser.goTo("http://localhost:" + port);
	}

	@Cuando("^no estoy logueado$")
	public void voy_a_la_página_principal() throws Throwable {
		Login.logout();
	}

	@Entonces("^la pagina contiene (.+)$")
	public void el_título_es(String contenido) throws Throwable {
		String[] palabras = contenido.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			assertThat(testBrowser.pageSource().contains(palabras[i]));
		}
	}

}