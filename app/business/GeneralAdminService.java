package business;

import java.util.Date;

import model.AbstractOrganization;
import model.UploadDocs;
import model.User;
import model.exception.BusinessException;

public interface GeneralAdminService {

	public void updateONG(AbstractOrganization organization)
			throws BusinessException;

	public void updateDocs(UploadDocs doc) throws BusinessException;

	public void addExternalSource(String link, User user)
			throws BusinessException;

	public void updateExternalSource(UploadDocs doc) throws BusinessException;

	public void addDoc(String area, String indicator, String measure,
			AbstractOrganization provider, User user, Date time)
			throws BusinessException;

	public void listOngs() throws BusinessException;

	public void deleteUser(User newUser) throws BusinessException;

	public void deleteONG(AbstractOrganization organization)
			throws BusinessException;

	public void deleteDoc(Long id) throws BusinessException;

	public void addUser(User newUser) throws BusinessException;

	public void addONG(AbstractOrganization organization)
			throws BusinessException;

}
