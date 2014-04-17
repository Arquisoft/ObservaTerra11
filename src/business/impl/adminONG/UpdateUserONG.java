package business.impl.adminONG;

import business.impl.Command;
import model.AbstractOrganization;
import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;

public class UpdateUserONG implements Command{

	private User user;
	private AbstractOrganization organizationAdmin;
	
	public UpdateUserONG(User user, AbstractOrganization organizationAdmin)
	{
		this.user = user;
		this.organizationAdmin = organizationAdmin;
	}
	
	
	public Object execute() throws BusinessException
	{
		
		if(user.getBelongs().getId() == organizationAdmin.getId())
		{
			Jpa.getManager().merge(user);
		}
		
		else
		{
			throw new BusinessException("No se puede modificar trabajadores que no pertenecen a tu misma organización");
		}
		return null;
	}
}
