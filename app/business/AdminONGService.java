package business;

import java.util.Date;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;

public interface AdminONGService {

	public void updateUsersONG(User user) throws BusinessException;

	public void updateDocs(UploadDocs doc) throws BusinessException;

	public void addExternalSource(String link, User user)
			throws BusinessException;

	public void updateExternalSource(UploadDocs doc) throws BusinessException;

	public void AddDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException;

	public void AddUserONG(User admin, User newUser) throws BusinessException;

	public void DeleteDoc(Long id) throws BusinessException;

	public void DeleteUserONG(User admin, User newUser)
			throws BusinessException;

	public void ListUploadDocs(User user) throws BusinessException;

	public void ListUploadUsers(User user) throws BusinessException;
}
