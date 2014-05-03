package persistence;

import model.User;
import persistence.util.Jpa;


public class GeneralFinder {

	 public static User findUserByLogin(String login) {
	 return (User) Jpa.getManager().createNamedQuery("general.findUserLogin")
	 .setParameter(1, login).getSingleResult();
	 }


}
