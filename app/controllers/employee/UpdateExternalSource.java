package controllers.employee;

import static play.data.Form.form;
import models.UploadDocs;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;
import controllers.routes;

public class UpdateExternalSource extends Controller {

	private UploadDocs doc;

	public String validate() {
		try {
			ServicesFactory.getEmployeeService().updateExternalSource(doc);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result updateExternalSource() { //get
		return ok();
	}

	public static Result post() {
		Form<UpdateExternalSource> form = form(UpdateExternalSource.class)
				.bindFromRequest();
		if (form.hasErrors()) {
			return badRequest();
		} else {
			return redirect(routes.Application.index());
		}
	}

}
