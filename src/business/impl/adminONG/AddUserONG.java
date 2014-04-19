package business.impl.adminONG;

import javax.persistence.EntityManager;

import persistence.util.Jpa;
import model.User;
import model.exception.BusinessException;
import business.impl.Command;

public class AddUserONG implements Command{
	private User admin;
	private User newUser;
	
	public AddUserONG(User admin, User newUser) {
		this.admin = admin;
		this.newUser = newUser;
	}
	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em  = Jpa.getManager();
		
		admin = em.find(User.class, admin.getId());
		
		admin.getBelongs().addBelongs(newUser);
		
		return null;
	}

}
