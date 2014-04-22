package business.impl.adminONG;

import business.impl.Command;
import model.AbstractOrganization;
import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;

public class UpdateUserONG implements Command{

	private User user;

	
	public UpdateUserONG(User user)
	{
		this.user = user;
	}
	
	
	public Object execute() throws BusinessException
	{
		
		Jpa.getManager().merge(user);
		
		return null;
	}
}
