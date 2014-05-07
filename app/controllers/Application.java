package controllers;

import model.Country;
import model.Indicator;
import model.Observation;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result index() {
		return ok("index");
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

	static Form<Country> countryForm = Form.form(Country.class);
	static Form<Indicator> indicatorForm = Form.form(Indicator.class);
	static Form<Observation> observationForm = Form.form(Observation.class);

}
