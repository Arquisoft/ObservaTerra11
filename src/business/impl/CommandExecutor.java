package business.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import persistence.util.Jpa;

import model.exception.BusinessException;


public class CommandExecutor {

	public Object execute(Command command) throws BusinessException {

		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		trx.begin();

		Object ret = null;
		try {
			ret = command.execute();
			trx.commit();
		} catch (BusinessException bex) {
			if (trx.isActive())
				trx.rollback();
			throw bex;
		} catch (RuntimeException tex) {
			if (trx.isActive())
				trx.rollback();
			throw tex;
		} finally {
			if (em.isOpen())
				em.close();
		}

		return ret;
	}
}
