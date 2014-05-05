package controllers.adminONG;

import models.User;
import models.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class ListUploadDocs extends Controller {
	
	public static Result showOngs(User user) {
//		try {
//			return ok(uploadeddocs.render(ServicesFactory.getEmployeeService()
//					.ListUploadDocs(user)));
//		} catch (BusinessException e) {
//			return ok(fail.render(e.getMessage()));
//		}
		return null;
	}

}
