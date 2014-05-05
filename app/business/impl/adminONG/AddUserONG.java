package business.impl.adminONG;

import javax.persistence.EntityManager;

import models.User;
import models.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class AddUserONG implements Command {

	private User admin;
	private User newUser;

	public AddUserONG(User admin, User newUser) {
		this.admin = admin;
		this.newUser = newUser;
	}

	@Override
	public Object execute() throws BusinessException {

		EntityManager em = Jpa.getManager();

		admin = em.merge(admin);

		admin.getBelongs().addBelongs(newUser);
		return null;
	}

}
