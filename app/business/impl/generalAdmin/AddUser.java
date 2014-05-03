package business.impl.generalAdmin;

import javax.persistence.EntityManager;

import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class AddUser implements Command {
	private User newUser;

	// entiendo que un administrador general puede agregar cualquier usuario
	public AddUser(User newUser) {
		this.newUser = newUser;
	}

	@Override
	public Object execute() throws BusinessException {

		EntityManager em = Jpa.getManager();

		em.persist(newUser);

		return null;
	}

}
