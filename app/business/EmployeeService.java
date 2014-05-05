package business;

import java.util.Date;

import models.AbstractOrganization;
import models.UploadDocs;
import models.User;
import models.exception.BusinessException;

public interface EmployeeService {

	public void updateDocs(UploadDocs doc) throws BusinessException;

	public void addExternalSource(String link, User user)
			throws BusinessException;

	public void updateExternalSource(UploadDocs doc) throws BusinessException;

	public void addDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException;

	public void deleteDoc(Long id) throws BusinessException;

	public void ListUploadDocs(User user) throws BusinessException;

	public void addUserONG(User admin, User newUser) throws BusinessException;

	void deleteUserONG(User admin, User newUser) throws BusinessException;

	void ListUploadUsers(User user) throws BusinessException;
}
