package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import models.Business;
import models.Collaborator;
import models.User;

public class Login extends Controller {

	public String username;
	public String password;

	/*
	 * Limpia la sesión y mete en ésta los datos del usuario si existe
	 */
	public String validate() {
		String validado = "Error";
		if (validarUser())
			validado = null;
		else if (validarColaborador())
			validado = null;
		else if (validarBusiness())
			validado = null;
		return validado;
	}

	public static Result logout() {
		session().clear();
		return redirect(routes.Application.index());
	}

	/*
	 * Comprueba si el el usuario que intenta loguearse existe, coincide su
	 * password y si está activo
	 */
	private boolean validarUser() {
		// session().isDirty = true;
		User user = User.findByLogin(username);
		if (user != null // && user.active == true
				&& user.password.compareTo(password) == 0) {
			session().put("id", user.id);
			session().put("name", user.name);
			session().put("password", user.password);
			session().put("email", user.email);
			session().put("type", user.type);
			return true;
		}
		return false;
	}

	/*
	 * Comprueba si el el usuario que intenta loguearse existe, coincide su
	 * password y si está activo
	 */
	private boolean validarColaborador() {
		// session().isDirty = true;
		Collaborator colaborador = Collaborator.findByLogin(username);
		if (colaborador != null // && colaborador.active == true
				&& colaborador.password.compareTo(password) == 0) {
			session().put("id", colaborador.id);
			session().put("name", colaborador.name);
			session().put("password", colaborador.password);
			session().put("email", colaborador.email);
			session().put("type", colaborador.type);
			session().put("phone", colaborador.phone);
			session().put("adress", colaborador.address);
			session().put("organization", colaborador.organization);
			session().put("specialization", colaborador.specialization);
			return true;
		}
		return false;
	}

	/*
	 * Comprueba si el el usuario que intenta loguearse existe, coincide su
	 * password y si está activo
	 */
	private boolean validarBusiness() {
		// session().isDirty = true;
		Business business = Business.findByLogin(username);
		if (business != null // && business.active == true
				&& business.password.compareTo(password) == 0) {
			session().put("id", business.id);
			session().put("name", business.name);
			session().put("password", business.password);
			session().put("email", business.email);
			session().put("type", business.type);
			session().put("nif", business.nif);
			session().put("description", business.id);
			session().put("phone", business.phone);
			session().put("address", business.address);
			session().put("webSite", business.webSite);
			return true;
		}
		return false;
	}

	/**/
	public static Result login() {
		return ok(login.render(Form.form(Login.class)));
	}

	/**/
	public static Result authenticate() {
		Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			return redirect(routes.Application.index());
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}