package business.impl;


import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.EmployeeService;
import business.impl.employee.AddExternalSource;
import business.impl.employee.UpdateDoc;
import business.impl.employee.UpdateExternalSource;

public class EmployeeServiceImpl implements EmployeeService{

	CommandExecutor executor = new CommandExecutor();
	
	@Override
	public void updateDocs(UploadDocs doc, Long idEmployed) throws BusinessException {
		
		executor.execute(new UpdateDoc(doc, idEmployed));
	}

	@Override
	public void addExternalSource(String link, User user) throws BusinessException {
	
		executor.execute(new AddExternalSource(link, user));
	}

	@Override
	public void updateExternalSource(UploadDocs doc, User user) throws BusinessException {
		
		executor.execute(new UpdateExternalSource(doc, user));
	}


	
	

}
