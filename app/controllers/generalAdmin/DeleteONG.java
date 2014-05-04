package controllers.generalAdmin;

import model.AbstractOrganization;
import model.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class DeleteONG extends Controller {
	
	public String deleteONG(AbstractOrganization organization) {
		try {
			ServicesFactory.getGeneralAdminService().deleteONG(organization);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}

	public static Result deleteONG() { // get
		return ok();// deleteONG.render()
	}

}
