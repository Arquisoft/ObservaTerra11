package business;

import models.UploadDocs;

import models.exception.BusinessException;

public interface EmployeeService {
	
	public void updateDocs(UploadDocs doc) throws BusinessException;
	

	//	public void addExternalSource(String link, User user) throws BusinessException;

	
	public void updateExternalSource(UploadDocs doc) throws BusinessException;
}
