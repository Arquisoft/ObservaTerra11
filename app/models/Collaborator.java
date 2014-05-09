package models;

import java.util.List;

import javax.persistence.Entity;

import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

@SuppressWarnings("serial")
@Entity
public class Collaborator extends Users {

	public String phone;
	public String address;
	public String organization;
	public String specialization;

	public Collaborator(String id, String name, String password, String email,
			boolean active, String phone, String address, String organization,
			String specialization) {
		super(id, name, password, email, "collaborator", active);
		this.phone = phone;
		this.address = address;
		this.organization = organization;
		this.specialization = specialization;
	}

	public static Finder<String, Collaborator> find = new Finder<String, Collaborator>(
			String.class, Collaborator.class);

	public static List<Collaborator> all() {
		return find.all();
	}

	public static void create(Collaborator u) {
		if (Collaborator.findByLogin(u.id) == null) {
			u.save();
		}
	}

	public static Collaborator findByLogin(String login) {
		return find.where().eq("id", login).findUnique();
	}

	public static void remove(String login) {
		find.ref(login).delete();
	}

	public static void deleteAll() {
		for (Collaborator u : all())
			u.delete();
	}

	public static JsonNode toJson(Collaborator u) {
		return Json.toJson(u);
	}

	public static Object authenticate(String username, String password) {
		Collaborator c = find.where().eq("id", username).findUnique();
		// System.out.println("--------------   " + c.password);
		if (c == null)
			return null;
		if (c.password.equals(password)) {
			return c;
		} else
			return null;
	}

}