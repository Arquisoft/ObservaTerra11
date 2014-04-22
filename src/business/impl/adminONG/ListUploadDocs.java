package business.impl.adminONG;

import java.util.List;

import persistence.AdminONGFinder;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;

public class ListUploadDocs {

	User user;
	
	public ListUploadDocs(User user)
	{
		this.user = user;
	}
	
	public Object execute() throws BusinessException {

		List<UploadDocs> docs = AdminONGFinder.loadUpDocs(user); //se listan todos los documentos que subio él mismo

		return docs;
	}
}
