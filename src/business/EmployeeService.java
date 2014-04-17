package business;

import model.UploadDocs;
import model.exception.BusinessException;

public interface EmployeeService {
	
	public void updateDocs(UploadDocs doc, Long idEmployeed) throws BusinessException;
	

}
