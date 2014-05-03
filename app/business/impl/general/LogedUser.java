package business.impl.general;


import persistence.GeneralFinder;

import models.exception.BusinessException;
import business.impl.Command;

public class LogedUser implements Command {
	private String login;
	private String password;

	public LogedUser(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Override
	public Object execute() throws BusinessException {


		// User user = (User) GeneralFinder.findUserByLogin(login);

		// if (user != null && user.getPassword().equals(password))
		// throw new BusinessException(
		// "el usuario no existe o la password no coincide");

		// return user;

		// este return sobra
		return null;
	}

}
