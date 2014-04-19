package business;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;

import model.exception.BusinessException;

public interface GeneralAdminService {
	
	public void updateONG(AbstractOrganization organization) throws BusinessException;
	
	public void updateDocs(UploadDocs doc, Long idAdmin) throws BusinessException;
	
	public void addExternalSource(String link, User user) throws BusinessException;
	
	public void updateExternalSource(UploadDocs doc, User user) throws BusinessException;

}
