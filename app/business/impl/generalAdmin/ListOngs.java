package business.impl.generalAdmin;

import java.util.List;

import persistence.AdminFinder;
import model.AbstractOrganization;
import model.exception.BusinessException;
import business.impl.Command;

public class ListOngs implements Command{

	public Object execute() throws BusinessException {

		List<AbstractOrganization> orgs = AdminFinder.loadOngs();

		return orgs;
	}

}
