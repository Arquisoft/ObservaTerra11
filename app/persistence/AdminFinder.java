package persistence;

import java.util.List;

import persistence.util.Jpa;
import model.AbstractOrganization;

public class AdminFinder {

	@SuppressWarnings("unchecked")
	public static List<AbstractOrganization> loadOngs() {
		return Jpa.getManager().createNamedQuery("ONG.findAll").getResultList();
	}

}
