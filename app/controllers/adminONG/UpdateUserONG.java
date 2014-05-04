package controllers.adminONG;

import static play.data.Form.form;
import model.User;
import model.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class UpdateUserONG extends Controller {

	private User user;

	public String validate() {
		try {
			ServicesFactory.getAdminAdminONGService().updateUsersONG(user);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateONG() { //get
		return ok();
	}

	public static Result post() {
		Form<UpdateUserONG> updateUserONGForm = form(UpdateUserONG.class)
				.bindFromRequest();
		if (updateUserONGForm.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
