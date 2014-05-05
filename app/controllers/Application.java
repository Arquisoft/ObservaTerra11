package controllers;

import static play.data.Form.form;
import model.Country;
import model.Indicator;
import model.Observation;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import controllers.general.Register;
import views.html.*;

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

	static Form<Country> countryForm = Form.form(Country.class);
	static Form<Indicator> indicatorForm = Form.form(Indicator.class);
	static Form<Observation> observationForm = Form.form(Observation.class);

}
