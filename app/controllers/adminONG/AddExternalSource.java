package controllers.adminONG;

import static play.data.Form.form;
import models.User;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class AddExternalSource extends Controller {

	private String link;
	private User user;

	public String validate() {
		try {
			ServicesFactory.getAdminAdminONGService().addExternalSource(link, user);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateONG() { // get
		return ok();
	}

	public static Result post() {
		Form<AddExternalSource> form = form(AddExternalSource.class)
				.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
