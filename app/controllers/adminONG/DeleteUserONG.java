package controllers.adminONG;

import models.User;
import models.exception.BusinessException;
import conf.ServicesFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class DeleteUserONG extends Controller {
	
	public String deleteUserONG(User admin,User user) {
		try {
			ServicesFactory.getEmployeeService().deleteUserONG(admin,user);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result deleteUser() { // get
		return ok();// deleteUser.render()
	}

}
