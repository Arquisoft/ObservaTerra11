package controllers.general;

import static play.data.Form.form;
import models.exception.BusinessException;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import conf.ServicesFactory;
import controllers.routes;

public class Login extends Controller {
	
	public String loginString;
	public String password;

	public String validate() {
		try {
			ServicesFactory.getGeneralService().getLogedUser(loginString, password);
			return null;
		} catch (BusinessException e) {
			return e.getMessage();
		}
	}
	
	public static Result login() {
		return ok(login.render(form(Login.class)));
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			session("login", loginForm.get().loginString);
			return redirect(routes.Application.index());
		}
	}

}