package controllers.employee;

import static play.data.Form.form;
import model.User;
import model.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class UpdateDocs extends Controller {

	private String link;
	private User user;

	public String get() {
		try {
			ServicesFactory.getGeneralAdminService().addExternalSource(link,
					user);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateONG() {
		return ok();
	}

	public static Result post() {
		Form<UpdateDocs> form = form(UpdateDocs.class)
				.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
