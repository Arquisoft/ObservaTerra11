package persistence;

import java.util.List;

import model.UploadDocs;
import model.User;
import persistence.util.Jpa;


public class AdminONGFinder {

	 @SuppressWarnings("unchecked")
	 public static List<UploadDocs> loadUpDocs(User user) {
	
	 return
	 Jpa.getManager().createNamedQuery("User.listUploads").setParameter(1,
	 user.getId()).getResultList();
	 }
	
	
	@SuppressWarnings("unchecked")
	public static List<User> loadUpdateUsers(User user) {
		
		return Jpa.getManager().createNamedQuery("User.listUpdateUsers").setParameter(1, user.getBelongs()).getResultList();
	}

	
}
