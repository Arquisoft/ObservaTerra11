package business.impl.employee;

import java.util.List;

import model.UploadDocs;
import model.User;
import model.exception.BusinessException;
import persistence.EmployeeFinder;
import business.impl.Command;

public class ListUploadDocs implements Command {

	User user;

	public ListUploadDocs(User user) {
		this.user = user;
	}

	public Object execute() throws BusinessException {

		List<UploadDocs> docs = EmployeeFinder.loadUpDocs(user);

		return docs;
	}
}
