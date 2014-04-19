package business.impl.generalAdmin;

import javax.persistence.EntityManager;

import persistence.util.Jpa;
import model.User;
import model.exception.BusinessException;
import business.impl.Command;

public class AddUser implements Command{
	private User newUser;
	
	//entiendo que un administrador general puede agregar cualquier usuario
	public AddUser( User newUser) {
		this.newUser = newUser;
	}
	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em  = Jpa.getManager();
		
		em.persist(newUser);
		
		return null;
	}

}
