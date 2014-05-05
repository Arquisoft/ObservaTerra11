package business;

import models.User;
import models.exception.BusinessException;



public interface GeneralService {

	 public User getLogedUser(String login, String password)
	 throws BusinessException;


}
