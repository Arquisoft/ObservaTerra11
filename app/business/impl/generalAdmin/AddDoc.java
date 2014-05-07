package business.impl.generalAdmin;


import java.util.Date;

import javax.persistence.EntityManager;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class AddDoc implements Command {

	 private User user;

	private AbstractOrganization provider;
	private String measure;
	private String indicator;
	private String area;


	// aqui pondríamos la logica para almacenar los ficheros que se subieron.
	 public AddDoc(String area, String indicator, String measure,
	 AbstractOrganization provider,User user, Date time) {
	 this.area = area;
	 this.indicator = indicator;
	 this.measure = measure;
	 this.provider = provider;
	 this.user = user;
	 }

	@Override
	public Object execute() throws BusinessException {
		EntityManager em = Jpa.getManager();


		 User u = em.merge(user);
		AbstractOrganization o = em.merge(provider);

		em.persist(new UploadDocs(area, indicator, measure, o, u, new Date(),
				false));

		return null;
	}

}
