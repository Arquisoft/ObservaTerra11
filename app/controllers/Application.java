package controllers;

import static play.data.Form.form;
import models.Country;
import models.Indicator;
import models.Observation;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.adminAnadirUsuario;
import views.html.adminPanel;
import views.html.index;
import controllers.general.DeleteUser;
import controllers.general.Register;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	public static Result showCountries() {
		return ok("showCountries");
	}

	public static Result showIndicators() {
		return ok("showIndicators");
	}

	public static Result showObservations() {
		return ok("showObservation");
	}

	public static Result bars(String indicator) {
		return ok("bars");
	}
	
	public static Result administrador(){
		return ok(adminPanel.render());
	}
	
	public static Result adminAnadir(){
		return ok(adminAnadirUsuario.render(form(Register.class)));
	}
	
	public static Result adminBorrarUsuario(){
		return DeleteUser.deleteUser();
	}
	
	public static Result adminListarUsuarios(){
		return ok();//adminListarUsuarios.render(ServicesFactory.);
	}

	static Form<Country> countryForm = Form.form(Country.class);
	static Form<Indicator> indicatorForm = Form.form(Indicator.class);
	static Form<Observation> observationForm = Form.form(Observation.class);

}
