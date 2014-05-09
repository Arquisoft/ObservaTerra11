package models;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;

import play.libs.Json;

import javax.persistence.OneToMany;

import models.Observation;

import com.fasterxml.jackson.databind.JsonNode;

@SuppressWarnings("serial")
@Entity
public class User extends Users {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	List<Observation> observations;

	public User(String id, String name, String password, String email,
			String type, boolean active) {
		super(id, name, password, email, type, active);
	}

	public static Finder<String, User> find = new Finder<String, User>(
			String.class, User.class);

	public static List<User> all() {
		return find.all();
	}

	public static void create(User u) {
		if (User.findByLogin(u.id) == null) {
			u.save();
		}
	}

	public static User findByLogin(String id) {
		User u = find.where().eq("id", id).findUnique();
		return u;
	}

	public static void remove(String login) {
		find.ref(login).delete();
	}

	public static void deleteAll() {
		for (User u : all())
			u.delete();
	}

	public static JsonNode toJson(User u) {
		return Json.toJson(u);
	}

	public static User authenticate(String username, String password) {
		User u = find.where().eq("id", username).findUnique();
		if (u == null)
			return null;
		if (u.password.equals(password)) {
			return u;
		} else
			return null;
	}
}