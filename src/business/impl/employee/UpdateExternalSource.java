package business.impl.employee;

import javax.persistence.EntityManager;

import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import persistence.util.Jpa;
import business.impl.Command;

public class UpdateExternalSource implements Command{
	
	private UploadDocs doc;
	User user;
	

	public UpdateExternalSource(UploadDocs doc, User user) {
		
		this.doc = doc;
		this.user = user;
		
	}

	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em = Jpa.getManager();
		
		if(doc.getUser().getId() == user.getId())
		{
			em.merge(doc);
		}
		
		else
		{
			throw new BusinessException("No se puede modificar una fuente externa de otro empleado/administrador");
		}
		return null;
	}

}
