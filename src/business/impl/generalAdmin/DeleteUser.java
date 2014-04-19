package business.impl.generalAdmin;

import javax.persistence.EntityManager;

import persistence.util.Jpa;
import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.impl.Command;

public class DeleteUser implements Command{
	private User user;
	
	public DeleteUser(User newUser) {
		this.user = newUser;
	}
	@Override
	public Object execute() throws BusinessException {
		
		EntityManager em  = Jpa.getManager();
		
		user = em.find(User.class, user);
		
		AbstractOrganization org = user.getBelongs();
		
		//borramos todas las relaciones del usuario con los documentos que subio
		//los documentos siguen perteneciendo a la ong
		for(UploadDocs u :user.getUploadDocs())
			user.removeDoc(u);
		
		
		if( org != null)
			org.removeBelongs(user);
		
		return null;
	}

}
