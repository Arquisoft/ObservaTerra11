package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import models.*;
import views.html.*;

import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import utils.ExcelReader;
import static play.data.Form.*;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render(Observation.all(),Country.all(),Indicator.all()));
    }

    public static Result showCountries() {
    	return ok(country.render(Country.all(),countryForm));
    }
    
    public static Result showIndicators() {
    	return ok(indicator.render(Indicator.all(),indicatorForm));
    }
    
    public static Result showObservations() {
    	return ok(observation.render(Observation.find.all(),Country.all(),Indicator.all(),observationForm));
    }
    
    public static Result bars(String indicator) {
    	return ok(bars.render(Indicator.findByCode(indicator)));
    }

    static Form<Country>  	  countryForm     = Form.form(Country.class);
    static Form<Indicator>    indicatorForm   = Form.form(Indicator.class);
    static Form<Observation>  observationForm = Form.form(Observation.class);
    
 public static class Login {
        
        public String email;
        public String password;
        
        public String validate() {
            if(User.authenticate(email, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }
        
    }

 /**
  * Handle login form submission.
  */
 public static Result authenticate() {
     Form<Login> loginForm = form(Login.class).bindFromRequest();
     if(loginForm.hasErrors()) {
         return badRequest(login.render(loginForm));
     } else {
         session("email", loginForm.get().email);
         return redirect(
        		 routes.Application.index()
         );
     }
 }

}
