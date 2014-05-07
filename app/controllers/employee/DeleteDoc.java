package controllers.employee;

import model.exception.BusinessException;
import conf.ServicesFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class DeleteDoc extends Controller {
	
	public String deleteDoc(Long id) {
		try {
			ServicesFactory.getEmployeeService().deleteDoc(id);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result deleteDoc() { // get
		return ok();// deleteDoc.render()
	}


}
