package business.impl.adminONG;


import javax.persistence.EntityManager;


import java.util.Date;

import javax.persistence.EntityManager;

import models.UploadDocs;
import models.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class AddExternalSource implements Command{

	private String indicator;

//	User user;
	

//	public AddExternalSource(String link, User user) {
//		
//		this.indicator = link;
//		this.user = user;
//	}

	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em = Jpa.getManager();
		

		//		em.persist(new UploadDocs(null, indicator, null, user.getBelongs() ,user ,new Date(), true));
		
		return null;
	}
}
