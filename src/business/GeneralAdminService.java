package business;

import model.AbstractOrganization;
import model.UploadDocs;

import model.exception.BusinessException;

public interface GeneralAdminService {
	
	public void updateONG(AbstractOrganization organization) throws BusinessException;
	
	public void updateDocs(UploadDocs doc, Long idAdmin) throws BusinessException;

}
