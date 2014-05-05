package controllers.generalAdmin;

import static play.data.Form.form;
import models.User;
import models.exception.BusinessException;
import models.types.PermissionLevel;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.signup;
import conf.ServicesFactory;
import controllers.routes;
import controllers.general.Register;

public class AddUser extends Controller {
	
	public String login;
	public String password;
	public String repeatPassword;
	public String email;
	public PermissionLevel permission;

	public String validate() {
		if (!checkPasswords()) {
			return "password NOOOOO :(";
		}
		try {
			ServicesFactory.getGeneralAdminService().addUser(
					new User(login,email, password, permission));
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}

	}

	public static Result signUp() {
		return ok(signup.render(form(Register.class)));
	}

	public static Result saveUser() {
		Form<Register> registerForm = form(Register.class).bindFromRequest();
		if (registerForm.hasErrors()) {
			return badRequest(signup.render(registerForm));
		} else {
			return redirect(routes.Application.index());
		}
	}

	public boolean checkPasswords() {
		System.out.println(password);
		System.out.println(repeatPassword);
		return password.equals(repeatPassword);

	}

}
