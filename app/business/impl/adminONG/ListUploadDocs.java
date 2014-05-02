package business.impl.adminONG;

import java.util.List;

import persistence.AdminONGFinder;
import models.UploadDocs;
import models.User;
import models.exception.BusinessException;

public class ListUploadDocs {

	User user;
	
	public ListUploadDocs(User user)
	{
		this.user = user;
	}
	
	public Object execute() throws BusinessException {

		List<UploadDocs> docs = AdminONGFinder.loadUpDocs(user); //se listan todos los documentos que subio �l mismo

		return docs;
	}
}
