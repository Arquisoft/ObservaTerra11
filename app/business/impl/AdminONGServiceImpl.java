package business.impl;

import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.AdminONGService;
import business.impl.adminONG.AddExternalSource;
import business.impl.adminONG.UpdateExternalSource;
import business.impl.adminONG.UpdateUserONG;
import business.impl.employee.UpdateDoc;


public class AdminONGServiceImpl implements AdminONGService{

	CommandExecutor executor = new CommandExecutor();
	

	 @Override
	 public void updateUsersONG(User user) throws BusinessException {
	
	 executor.execute(new UpdateUserONG(user));
	 }


	@Override
	public void updateDocs(UploadDocs doc) throws BusinessException {
	
		executor.execute(new UpdateDoc(doc));
	}


	@Override
	public void addExternalSource(String link, User user)
			throws BusinessException {

		executor.execute(new AddExternalSource(link, user));

	}


	@Override
	public void updateExternalSource(UploadDocs doc) throws BusinessException {
		
		executor.execute(new UpdateExternalSource(doc));
	}
	
	

}
