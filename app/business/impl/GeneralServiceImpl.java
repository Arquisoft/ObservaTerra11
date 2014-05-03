package business.impl;

import model.User;
import model.exception.BusinessException;
import business.impl.general.LogedUser;



public class GeneralServiceImpl {
	CommandExecutor executor = new CommandExecutor();
	

	public User getLogedUser(String login, String password)
			throws BusinessException {
		return (User) executor.execute(new LogedUser(login, password));
 }

}
