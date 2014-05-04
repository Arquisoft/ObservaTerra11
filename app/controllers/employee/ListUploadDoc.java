package controllers.employee;

import model.User;
import model.exception.BusinessException;
import play.mvc.Controller;
import play.mvc.Result;
import conf.ServicesFactory;

public class ListUploadDoc extends Controller {
	
	 public static Result showUploadDocs(User user) {
		//	 try{
		 //       return ok(ongs.render(ServicesFactory.getEmployeeService().ListUploadDocs(user)));
		//	 } catch(BusinessException e){
		//		 return ok(fail.render(e.getMessage()));
		//	 }
			 return null;
		    }


}
