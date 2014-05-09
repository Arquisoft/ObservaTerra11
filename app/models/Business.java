package models;

import java.util.List;

import javax.persistence.Entity;

import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

@SuppressWarnings("serial")
@Entity
public class Business extends Users {

	public String nif;
	public String description;
	public String phone;
	public String address;
	public String webSite;

	public Business(String id, String name, String password, String email,
			boolean active, String nif, String description, String phone,
			String address, String webSite) {

		super(id, name, password, email, "business", active);
		this.nif = nif;
		this.description = description;
		this.phone = phone;
		this.address = address;
		this.webSite = webSite;
	}

	public static Finder<String, Business> find = new Finder<String, Business>(
			String.class, Business.class);

	public static List<Business> all() {
		return find.all();
	}

	public static void create(Business u) {
		if (Business.findByLogin(u.id) == null) {
			u.save();
		}
	}

	public static Business findByLogin(String login) {
		return find.where().eq("id", login).findUnique();
	}

	public static void remove(String login) {
		find.ref(login).delete();
	}

	public static void deleteAll() {
		for (Business u : all())
			u.delete();
	}

	public static JsonNode toJson(Business u) {
		return Json.toJson(u);
	}

	public static Object authenticate(String username, String password) {
		Business b = find.where().eq("id", username).findUnique();
		if (b == null)
			return null;
		if (b.password.equals(password)) {
			return b;
		} else
			return null;
	}
}