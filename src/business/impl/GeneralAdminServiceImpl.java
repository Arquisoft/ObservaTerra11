package business.impl;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;

import model.exception.BusinessException;
import business.GeneralAdminService;

import business.impl.employee.UpdateDoc;
import business.impl.generalAdmin.AddExternalSource;
import business.impl.generalAdmin.UpdateExternalSource;
import business.impl.generalAdmin.UpdateONG;

public class GeneralAdminServiceImpl implements GeneralAdminService{
	
	CommandExecutor executor = new CommandExecutor();

	@Override
	public void updateONG(AbstractOrganization organization) throws BusinessException {
		
		executor.execute(new UpdateONG(organization));
		
	}

	@Override
	public void updateDocs(UploadDocs doc, Long idAdmin) throws BusinessException {
		
		executor.execute(new UpdateDoc(doc, idAdmin));
		
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
