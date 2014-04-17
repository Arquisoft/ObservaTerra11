package business.impl;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.AdminONGService;
import business.impl.adminONG.UpdateUserONG;
import business.impl.employee.UpdateDoc;

public class AdminONGServiceImpl implements AdminONGService{

	CommandExecutor executor = new CommandExecutor();
	
	@Override
	public void updateUsersONG(AbstractOrganization adminOrganization, User user) throws BusinessException {
		
		executor.execute(new UpdateUserONG(user, adminOrganization));
	}

	@Override
	public void updateDocs(UploadDocs doc, Long idAdmin) throws BusinessException {
	
		executor.execute(new UpdateDoc(doc, idAdmin));
	}

}
