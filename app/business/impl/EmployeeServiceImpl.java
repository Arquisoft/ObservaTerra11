package business.impl;


import models.UploadDocs;

import models.exception.BusinessException;
import business.EmployeeService;

import business.impl.employee.UpdateDoc;
import business.impl.employee.UpdateExternalSource;

public class EmployeeServiceImpl implements EmployeeService{

	CommandExecutor executor = new CommandExecutor();
	
	@Override
	public void updateDocs(UploadDocs doc) throws BusinessException {
		
		executor.execute(new UpdateDoc(doc));
	}


	// @Override
	// public void addExternalSource(String link, User user) throws
	// BusinessException {
	//
	// executor.execute(new AddExternalSource(link, user));
	// }


	@Override
	public void updateExternalSource(UploadDocs doc) throws BusinessException {
		
		executor.execute(new UpdateExternalSource(doc));
	}


	
	

}
