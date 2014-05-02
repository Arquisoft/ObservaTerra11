package business.impl;

import business.impl.general.LogedUser;
import models.User;
import models.exception.BusinessException;

public class GeneralServiceImpl {
	CommandExecutor executor = new CommandExecutor();
	
	public User getLogedUser(String login, String password) throws BusinessException {
		return (User) executor.execute(new LogedUser(login,password));
	}

}
