package business.impl.adminONG;

import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class UpdateUserONG implements Command {

	private User user;

	public UpdateUserONG(User user) {
		this.user = user;
	}

	public Object execute() throws BusinessException {

		Jpa.getManager().merge(user);

		return null;
	}
}
