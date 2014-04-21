package business;

import model.User;

import model.exception.BusinessException;

public interface GeneralService {

	public User getLogedUser(String login, String password)
			throws BusinessException;

}
