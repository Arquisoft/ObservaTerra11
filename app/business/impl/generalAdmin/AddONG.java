package business.impl.generalAdmin;

import persistence.util.Jpa;
import models.AbstractOrganization;
import models.exception.BusinessException;
import business.impl.Command;

public class AddONG implements Command {
	private AbstractOrganization org;
	
	public AddONG(AbstractOrganization org) {
		this.org = org;
	}

	@Override
	public Object execute() throws BusinessException {
		
		Jpa.getManager().persist(org);
		return null;
	}
}
