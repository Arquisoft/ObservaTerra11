package business;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;


public interface AdminONGService {

	
	
	public void updateUsersONG(AbstractOrganization adminOrganization, User user) throws BusinessException;
	
	public void updateDocs(UploadDocs doc, Long idAdmin) throws BusinessException;
}
