package controllers.adminONG;

import model.User;
import model.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class ListUploadUsers extends Controller {

	public static Result showOngs(User user) {
//		try {
//			return ok(uploadedusers.render(ServicesFactory.getEmployeeService()
//					.ListUploadUsers(user)));
//		} catch (BusinessException e) {
//			return ok(fail.render(e.getMessage()));
//		}
		return null;
	}

}
