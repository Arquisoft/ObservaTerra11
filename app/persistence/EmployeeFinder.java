package persistence;

import java.util.List;

import model.UploadDocs;
import model.User;
import persistence.util.Jpa;


public class EmployeeFinder {

	 @SuppressWarnings("unchecked")
	 public static List<UploadDocs> loadUpDocs(User user) {
	 return Jpa.getManager().createNamedQuery("User.listUploads")
	 .setParameter(1, user.getId()).getResultList();
	 }


}
