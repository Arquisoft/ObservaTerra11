package business;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;


public interface AdminONGService {

	
	
	public void updateUsersONG(User user) throws BusinessException;
	
	public void updateDocs(UploadDocs doc) throws BusinessException;
	
	public void addExternalSource(String link, User user) throws BusinessException;
	
	public void updateExternalSource(UploadDocs doc) throws BusinessException;
}
