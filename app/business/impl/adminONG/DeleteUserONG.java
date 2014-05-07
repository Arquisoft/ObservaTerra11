package business.impl.adminONG;

import javax.persistence.EntityManager;

import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class DeleteUserONG implements Command {
	private User admin;
	private User user;

	public DeleteUserONG(User admin, User newUser) {
		this.admin = admin;
		this.user = newUser;
	}

	@Override
	public Object execute() throws BusinessException {

		EntityManager em = Jpa.getManager();

		admin = em.merge(admin);

		admin.getBelongs().removeBelongs(user);

		return null;
	}

}
