package controllers.generalAdmin;

import static play.data.Form.form;
import models.AbstractOrganization;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class AddONG extends Controller {

	private AbstractOrganization organization;

	public String validate() {
		try {

			ServicesFactory.getGeneralAdminService().addONG(organization);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result addDoc() { // get
		return ok();// addONG.render(form(AbstractOrganozation.class))
	}

	public static Result post() {
		Form<AbstractOrganization> form = form(AbstractOrganization.class)
				.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}

	}
}
