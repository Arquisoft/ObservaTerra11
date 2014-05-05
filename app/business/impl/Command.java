package business.impl;

import models.exception.BusinessException;



public interface Command {

	Object execute() throws BusinessException;
}
