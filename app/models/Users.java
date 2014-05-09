package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public abstract class Users extends Model {

	@Id
	public String id;
	public String name;
	public String password;
	public String email;
	public String type;
	public boolean active;

	public Users(String id, String name, String password, String email,
			String type, boolean active) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.type = type;
		this.active = active;
	}

}