package logout;

import static org.fest.assertions.Assertions.assertThat;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import controllers.Login;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class LogoutSteps {

	@Inject
	private Login login = new Login();

	@Inject
	@Named("PORT")
	private Integer port;

	@Dado("^que estoy logueado$")
	public void que_estoy_logueado() throws Throwable {
		login.setUsername("labra");
		login.setPassword("asd");
		login.validate();
	}

	@Cuando("^le doy a logout")
	public void le_doy_a_logout() throws Throwable {
		Login.logout();
	}

	@Entonces("^me deslogueo con exito$")
	public void me_deslogueo_con_exito() throws Throwable {
		assertThat(Login.session().get("id") == null);
	}

}
