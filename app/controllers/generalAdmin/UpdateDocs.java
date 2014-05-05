package controllers.generalAdmin;

import static play.data.Form.form;
import models.UploadDocs;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class UpdateDocs extends Controller {

	private UploadDocs doc;

	public String validate() {
		try {
			ServicesFactory.getGeneralAdminService().updateDocs(doc);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateDocs() { //get
		return ok();
	}

	public static Result post() {
		Form<UpdateDocs> form = form(UpdateDocs.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}
}
