package business.impl.adminONG;

import java.util.List;

import models.User;
import models.exception.BusinessException;
import persistence.AdminONGFinder;
import business.impl.Command;

public class ListUploadUsers implements Command {

	User user;

	public ListUploadUsers(User user) {
		this.user = user;
	}

	public Object execute() throws BusinessException {

		List<User> users = AdminONGFinder.loadUpdateUsers(user);
		// puede modificar todos los empleados que trabajen en su mismo ONG

		return users;
	}

}
