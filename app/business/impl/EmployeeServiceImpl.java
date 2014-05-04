package business.impl;

import java.util.Date;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.EmployeeService;
import business.impl.adminONG.AddUserONG;
import business.impl.adminONG.DeleteUserONG;
import business.impl.adminONG.ListUploadUsers;
import business.impl.employee.AddDoc;
import business.impl.employee.AddExternalSource;
import business.impl.employee.DeleteDoc;
import business.impl.employee.UpdateDoc;
import business.impl.employee.UpdateExternalSource;
import business.impl.employee.ListUploadDocs;

public class EmployeeServiceImpl implements EmployeeService {

	CommandExecutor executor = new CommandExecutor();

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

	@Override
	public void addDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException {

		executor.execute(new AddDoc(area, indicator, measure, provider, user,
				time));
	}

	@Override
	public void deleteDoc(Long id) throws BusinessException {

		executor.execute(new DeleteDoc(id));
	}

	@Override
	public void ListUploadDocs(User user) throws BusinessException {

		executor.execute(new ListUploadDocs(user));
	}
	
	@Override
	public void ListUploadUsers(User user) throws BusinessException {

		executor.execute(new ListUploadUsers(user));
	}

	@Override
	public void addUserONG(User admin, User newUser) throws BusinessException {
		executor.execute(new AddUserONG(admin, newUser));
		
	}
	
	@Override
	public void deleteUserONG(User admin, User newUser) throws BusinessException {
		executor.execute(new DeleteUserONG(admin, newUser));
		
	}

}
