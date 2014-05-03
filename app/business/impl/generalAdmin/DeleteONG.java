package business.impl.generalAdmin;

import javax.persistence.EntityManager;

import persistence.util.Jpa;
import models.AbstractOrganization;
import models.exception.BusinessException;
import business.impl.Command;

public class DeleteONG implements Command {
	private AbstractOrganization org;
	
	public DeleteONG(AbstractOrganization org) {
		this.org = org;
	}

	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em = Jpa.getManager();
		
		org = em.find(AbstractOrganization.class, org);
		

//		if(org.getBelongs().isEmpty() && org.getOrgHave().isEmpty() && org.getOrgBelong() == null)
//			em.remove(org);
//		else
//			throw new BusinessException("no se puede borrar una ong que este relacionada con algo en la bd");
		
		return null;
	}
}
