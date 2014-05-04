package business.impl;

import model.exception.BusinessException;



public interface Command {

	Object execute() throws BusinessException;
}
