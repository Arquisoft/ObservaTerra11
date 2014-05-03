package business.impl.adminONG;

import java.util.List;

import business.impl.Command;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import persistence.AdminONGFinder;


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
