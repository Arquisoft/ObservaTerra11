package controllers.generalAdmin;

import models.User;
import models.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class DeleteUser extends Controller {
	
	public String deleteUser(User user) {
		try {
			ServicesFactory.getGeneralAdminService().deleteUser(user);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result deleteUser() { // get
		return ok();// deleteUser.render()
	}
}
