package controllers.generalAdmin;

import model.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class ListOngs extends Controller {
	
	 public static Result showOngs() {
		// try{
	     //   return ok(ongs.render(ServicesFactory.getGeneralAdminService().listOngs()));
		 //} catch(BusinessException e){
		//	 return ok(fail.render(e.getMessage()));
		 //}
		 return null;
	    }

}
