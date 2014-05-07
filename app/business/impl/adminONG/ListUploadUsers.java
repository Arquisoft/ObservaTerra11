package business.impl.adminONG;

import java.util.List;

import business.impl.Command;
import model.User;
import model.exception.BusinessException;
import persistence.AdminONGFinder;

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
