package controllers;

import models.Country;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
    public static Result saluda(String nombre) {
        return ok("Hola " + nombre + "!");
    }

    public static Result showCountries() {
        return ok(views.html.country.render(Country.finder.all(),countryForm));
    }

    public static Result newCountry(String name) {
    	Country country = new Country(name);
    	country.save();
    	return ok(views.html.country.render(Country.finder.all(),countryForm));
    }

    public static Result delCountry(Long id) {
    	Country country = Country.finder.byId(id);
    	country.delete();
    	return ok(views.html.country.render(Country.finder.all(),countryForm));
    }
    
    static Form<Country> countryForm = Form.form(Country.class);
    
}
