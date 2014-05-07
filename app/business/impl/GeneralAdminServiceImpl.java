package business.impl;

import java.util.Date;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import business.GeneralAdminService;
import business.impl.generalAdmin.AddExternalSource;
import business.impl.generalAdmin.AddONG;
import business.impl.generalAdmin.AddUser;
import business.impl.generalAdmin.DeleteDoc;
import business.impl.generalAdmin.DeleteONG;
import business.impl.generalAdmin.DeleteUser;
import business.impl.generalAdmin.ListOngs;
import business.impl.generalAdmin.UpdateDoc;
import business.impl.generalAdmin.UpdateExternalSource;
import business.impl.generalAdmin.UpdateONG;

public class GeneralAdminServiceImpl implements GeneralAdminService {

	CommandExecutor executor = new CommandExecutor();

	@Override
	public void updateONG(AbstractOrganization organization)
			throws BusinessException {

		executor.execute(new UpdateONG(organization));

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
	public void addDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException {

	}

	@Override
	public void listOngs() throws BusinessException {

		executor.execute(new ListOngs());
	}

	@Override
	public void deleteUser(User newUser) throws BusinessException {

		executor.execute(new DeleteUser(newUser));
	}

	@Override
	public void deleteONG(AbstractOrganization organization)
			throws BusinessException {

		executor.execute(new DeleteONG(organization));
	}

	@Override
	public void deleteDoc(Long id) throws BusinessException {

		executor.execute(new DeleteDoc(id));
	}

	@Override
	public void addUser(User newUser) throws BusinessException {

		executor.execute(new AddUser(newUser));
	}

	@Override
	public void addONG(AbstractOrganization organization)
			throws BusinessException {

		executor.execute(new AddONG(organization));
	}

}
