package business.impl.generalAdmin;

import business.impl.Command;
import persistence.util.Jpa;
import models.AbstractOrganization;

public class UpdateONG implements Command{

	AbstractOrganization organization;
	
	public UpdateONG(AbstractOrganization organization)
	{
		this.organization = organization;
	}
	
	public Object execute()
	{
		
		Jpa.getManager().merge(organization);
		
		return null;
	}
}
