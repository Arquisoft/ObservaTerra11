package business.impl;


import model.UploadDocs;
import model.exception.BusinessException;
import business.EmployeeService;
import business.impl.employee.UpdateDoc;

public class EmployeeServiceImpl implements EmployeeService{

	CommandExecutor executor = new CommandExecutor();
	
	@Override
	public void updateDocs(UploadDocs doc, Long idEmployed) throws BusinessException {
		
		executor.execute(new UpdateDoc(doc, idEmployed));
	}


	
	

}
