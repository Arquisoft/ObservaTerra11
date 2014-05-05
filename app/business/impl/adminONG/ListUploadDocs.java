package business.impl.adminONG;

import java.util.List;

import models.UploadDocs;
import models.User;
import models.exception.BusinessException;
import persistence.AdminONGFinder;
import business.impl.Command;


public class ListUploadDocs implements Command {

	User user;
	
	public ListUploadDocs(User user)
	{
		this.user = user;
	}
	
	public Object execute() throws BusinessException {
	
	 List<UploadDocs> docs = AdminONGFinder.loadUpDocs(user); //se listan todos los documentos que subio el mismo
	
	 return docs;
	 }

}
