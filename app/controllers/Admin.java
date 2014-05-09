package controllers;

import java.util.List;

import models.*;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;

public class Admin extends Controller {

	public static Result newCountry() {
		Form<Country> form = countryForm.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(views.html.country.render(Country.all(),
					countryForm));
		} else {
			Country countryToAdd = form.get();
			Country.create(countryToAdd);
			return redirect(routes.Application.showCountries());
		}
	}

	public static Result deleteCountry(String code) {
		Country.remove(code);
		return redirect(routes.Application.showCountries());
	}

	public static Result newIndicator() {
		Form<Indicator> form = indicatorForm.bindFromRequest();
		if (form.hasErrors() && session().get("type").equals("admin")) {
			return badRequest(views.html.indicator.render(Indicator.all(),
					indicatorForm));
		} else if (form.hasErrors() && session().get("type").equals("business")) {
			return badRequest(views.html.addIndicator.render(indicatorForm));
		} else if (session().get("type").equals("admin")) {
			Indicator ind = form.get();
			Indicator.create(ind);
			return redirect(routes.Application.showIndicators());
		} else if (session().get("type").equals("business")) {
			Indicator ind = form.get();
			Indicator.create(ind);
			return redirect(routes.Application.addIndicator());
		} else {
			return redirect(routes.Application.index());
		}
	}

	public static Result deleteIndicator(String code) {
		Indicator.remove(code);
		return redirect(routes.Application.showIndicators());
	}

	public static Result newObservation() {
		DynamicForm requestData = Form.form().bindFromRequest();
		String countryId = requestData.get("countryId");
		String indicatorId = requestData.get("indicatorId");
		String userId = requestData.get("userId");
		Double value = Double.parseDouble(requestData.get("value"));

		List<Observation> lista = Observation.findByIndicatorName(indicatorId);
		boolean encontrado = false;

		for (Observation o : lista) {

			if (o.country.code.equals(countryId)) {
				o.obsValue = (o.obsValue + value) / 2;
				o.save();
				encontrado = true;
			}
		}

		if (!encontrado) {
			Observation obs = new Observation(countryId, indicatorId, value,
					User.findByLogin(userId));
			obs.save();
		}
		if (session().get("type").equals("admin"))
			return redirect(routes.Application.showObservations());
		else
			return redirect(routes.Application.addObservation());
	}

	public static Result deleteObservation(Long id) {
		Observation.delete(id);
		return redirect(routes.Application.showObservations());
	}

	static Form<Country> countryForm = Form.form(Country.class);
	static Form<Indicator> indicatorForm = Form.form(Indicator.class);
	static Form<Observation> observationForm = Form.form(Observation.class);

}
