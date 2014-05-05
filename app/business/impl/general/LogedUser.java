package business.impl.general;


import models.User;
import models.exception.BusinessException;
import persistence.GeneralFinder;
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


		 User user = (User) GeneralFinder.findUserByLogin(login);

		 if (user != null && user.getPassword().equals(password))
		 throw new BusinessException(
		 "el usuario no existe o la password no coincide");

		 return user;
	}

}
