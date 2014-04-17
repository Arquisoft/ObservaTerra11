package business.impl;

import model.AbstractOrganization;
import model.UploadDocs;

import model.exception.BusinessException;
import business.GeneralAdminService;

import business.impl.employee.UpdateDoc;
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
	
	
}
