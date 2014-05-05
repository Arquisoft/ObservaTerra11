package controllers.employee;

import static play.data.Form.form;

import java.util.Date;

import models.AbstractOrganization;
import models.User;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class AddDoc extends Controller {
	
	private User user;
	private Date time;
	private String area;
	private String measure;
	private String indicator;
	private AbstractOrganization provider;

	public String validate() {
		try {
			
			ServicesFactory.getGeneralAdminService().addDoc(area, indicator, measure, provider, user, time);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result addDoc() { //get
		return ok();//addDoc.render(form(UploadDocs.class))
	}

	public static Result post() {
		Form<AddDoc> form = form(AddDoc.class)
				.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
