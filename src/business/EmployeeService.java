package business;

import model.UploadDocs;
import model.User;
import model.exception.BusinessException;

public interface EmployeeService {
	
	public void updateDocs(UploadDocs doc) throws BusinessException;
	
	public void addExternalSource(String link, User user) throws BusinessException;
	
	public void updateExternalSource(UploadDocs doc) throws BusinessException;
}
