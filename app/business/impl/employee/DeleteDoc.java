package business.impl.employee;

import javax.persistence.EntityManager;

import persistence.util.Jpa;
import model.UploadDocs;
import model.exception.BusinessException;
import business.impl.Command;

public class DeleteDoc implements Command {
	private Long id;
	
	public DeleteDoc(Long id) {
		this.id = id;
	}

	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em  = Jpa.getManager();
		UploadDocs doc = em.find(UploadDocs.class, id);
		doc.unlink();
		
		em.remove(doc);
		
		return null;
	}

}
