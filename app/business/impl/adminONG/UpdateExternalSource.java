package business.impl.adminONG;


import javax.persistence.EntityManager;

import models.UploadDocs;

import models.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;


public class UpdateExternalSource implements Command {

	private UploadDocs doc;

	public UpdateExternalSource(UploadDocs doc) {

		this.doc = doc;

	}

	@Override
	public Object execute() throws BusinessException {

		EntityManager em = Jpa.getManager();

		em.merge(doc);

		return null;
	}
}
