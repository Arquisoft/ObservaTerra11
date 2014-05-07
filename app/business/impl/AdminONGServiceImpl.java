package business.impl;

import java.util.Date;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.AdminONGService;
import business.impl.adminONG.AddExternalSource;
import business.impl.adminONG.UpdateExternalSource;
import business.impl.adminONG.UpdateUserONG;
import business.impl.adminONG.UpdateDoc;
import business.impl.adminONG.AddDoc;
import business.impl.adminONG.AddUserONG;
import business.impl.adminONG.DeleteDoc;
import business.impl.adminONG.DeleteUserONG;
import business.impl.adminONG.ListUploadUsers;
import business.impl.adminONG.ListUploadDocs;

public class AdminONGServiceImpl implements AdminONGService {

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

	@Override
	public void AddDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException {

		executor.execute(new AddDoc(area, indicator, measure, provider, user,
				time));
	}

	@Override
	public void AddUserONG(User admin, User newUser) throws BusinessException {

		executor.execute(new AddUserONG(admin, newUser));
	}

	@Override
	public void DeleteDoc(Long id) throws BusinessException {

		executor.execute(new DeleteDoc(id));
	}

	@Override
	public void DeleteUserONG(User admin, User newUser)
			throws BusinessException {

		executor.execute(new DeleteUserONG(admin, newUser));
	}

	@Override
	public void ListUploadDocs(User user) throws BusinessException {

		executor.execute(new ListUploadDocs(user));
	}

	@Override
	public void ListUploadUsers(User user) throws BusinessException {

		executor.execute(new ListUploadUsers(user));
	}

}
