package controllers;

import models.UserLabra;
import play.mvc.Controller;


public class Login extends Controller {

	public String email;
	public String password;

	public String validate() {
		if (UserLabra.authenticate(email, password) == null) {
			return "Invalid user or password";
		}
		return null;
	}

	// public static Result login() {
	// return ok(login.render(form(Login.class)));
	// }

	/**
	 * Handle login form submission.
	 */
	// public static Result authenticate() {
	// Form<Login> loginForm = form(Login.class).bindFromRequest();
	// if (loginForm.hasErrors()) {
	// return badRequest(login.render(loginForm));
	// } else {
	// session("email", loginForm.get().email);
	// return redirect(routes.Application.index());
	// }
	// }

}
