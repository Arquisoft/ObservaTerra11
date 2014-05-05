package controllers.general;

import static play.data.Form.form;

import java.util.List;

import models.User;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.adminBorrarUsuario;
import conf.ServicesFactory;
import controllers.routes;


public class DeleteUser extends Controller {
	
	public int id;
	private static List<User> users;

	public String validate() {
		return "HOLA";
	}
	
	public static Result deleteUser() {
		try {
		users = ServicesFactory.getGeneralAdminService().listUsers();
	
		return ok(adminBorrarUsuario.render(users,form(DeleteUser.class)));
		}catch(BusinessException e){
			return redirect(routes.Application.index());
		}
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<DeleteUser> deleteUser = form(DeleteUser.class).bindFromRequest();
		if (deleteUser.hasErrors()) {
			return badRequest(adminBorrarUsuario.render(users,deleteUser));
		} else {
			return redirect(routes.Application.index());
		}
	}

}
