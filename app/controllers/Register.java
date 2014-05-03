package controllers;

import models.UserLabra;

import play.mvc.Controller;

public class Register extends Controller {

	public String code;
	public String name;
	public String email;
	public String password;
	public String repeatPassword;

	public String validate() {

		UserLabra user; // este usuario deberia ser User que es el del modelo de
						// NUESTRA bd
		if (!checkPasswords()) {
			return "password NOOOOO :(";
		}
		if ((user = UserLabra.save(code, name, email, password)) == null) {

			return "THINGS WENT WRONG! :(";
		}
		return user.toString();
		// Esto es para hacerlo bien xD
		// return null;
	}

	// public static Result signUp() {
	// return ok(signup.render(form(Register.class)));
	// }

	// public static Result saveUser(){
	// Form<Register> registerForm = form(Register.class).bindFromRequest();
	// if (registerForm.hasErrors()) {
	// return badRequest(signup.render(registerForm));
	// } else {
	// return redirect(routes.Application.index());
	// }
	// }

	public boolean checkPasswords() {
		System.out.println(password);
		System.out.println(repeatPassword);
		return password.equals(repeatPassword);

	}

}
