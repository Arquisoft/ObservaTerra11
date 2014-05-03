package controllers;

import static play.data.Form.form;
import model.AbstractOrganization;
import model.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import conf.ServicesFactory;

public class UpdateONG extends Controller {

	private AbstractOrganization organization;

	public String validate() {
		try {
			ServicesFactory.getGeneralAdminService().updateONG(organization);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateONG(AbstractOrganization organization) {
		return ok(login.render(form(Login.class)));
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<UpdateONG> updateONGForm = form(UpdateONG.class).bindFromRequest();
		if (updateONGForm.hasErrors()) {
			return badRequest(login.render(form(Login.class)));
		} else {
			return redirect(routes.Application.index());
		}
	}

}
