package controllers.generalAdmin;

import models.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class DeleteDoc extends Controller {
	
	public String deleteDoc(Long id) {
		try {
			ServicesFactory.getGeneralAdminService().deleteDoc(id);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result deleteDoc() { // get
		return ok();// deleteDoc.render()
	}

}
