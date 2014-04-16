package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

@Entity
public class User extends Model {

	@Id
	public String code;
	public String name;
	public String email;
	public String password;

	public User(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public static Finder<String, User> find = new Finder(String.class,
			User.class);

	public static List<User> all() {
		return find.all();
	}

	public static void create(User user) {
		if (User.findByEmail(user.email) == null) {
			user.save();
		}
	}

	public static void remove(String code) {
		find.ref(code).delete();
	}

	public static void deleteAll() {
		for (User c : all())
			c.delete();
	}

	public static User findByEmail(String email) {
		return find.where().eq("email", email).findUnique();
	}

	public static User findByCode(String code) {
		return find.byId(code);
	}

	public static JsonNode toJson(User country) {
		return Json.toJson(country);
	}
}
