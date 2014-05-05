package controllers.generalAdmin;

import static play.data.Form.form;
import models.AbstractOrganization;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

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

	public static Result updateONG(AbstractOrganization organization) { //get
		return ok();
	}

	public static Result post() {
		Form<UpdateONG> updateONGForm = form(UpdateONG.class).bindFromRequest();
		if (updateONGForm.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
