package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import model.Country;
import model.Indicator;
import model.Observation;
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

    static Form<Country>  	  countryForm     = Form.form(Country.class);
    static Form<Indicator>    indicatorForm   = Form.form(Indicator.class);
    static Form<Observation>  observationForm = Form.form(Observation.class);

}
