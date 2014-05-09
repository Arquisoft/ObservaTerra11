package login;

import static org.fest.assertions.Assertions.assertThat;
import play.test.TestBrowser;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import controllers.Login;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class LoginSteps {

	@Inject
	private TestBrowser testBrowser;

	private Login login = new Login();

	@Inject
	@Named("PORT")
	private Integer port;

	@Dado("^que voy a la pagina de logueo$")
	public void que_voy_a_la_pagina_de_logueo() throws Throwable {
		testBrowser.goTo("http://localhost:" + port + "/login");
	}

	@Cuando("^introduzco (.+)$")
	public void introduzco(String data) throws Throwable {
		String[] palabras = data.split(" ");
		login.setUsername(palabras[0]);
		login.setPassword(palabras[2]);
	}

	@Entonces("^me logueo con exito$")
	public void me_logueo_con_exito() throws Throwable {
		assertThat(login.validate() == null);
	}

}