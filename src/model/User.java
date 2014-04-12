package model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import model.types.PermissionLevel;
@Entity
@Table(name = "TUSERS")
public class User implements Serializable {
	
	private static final long serialVersionUID = -1300746829036097964L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String login;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private PermissionLevel permission;
	
	@OneToMany(mappedBy = "user")
	private Set<Belongs> belongs = new HashSet<Belongs>();

	public User() {

	}

	public User(String login, String password, PermissionLevel permission) {
		this.login = login;
		this.password = password;
		this.permission = permission;
	}

	public Set<Belongs> getBelongs() {
		return Collections.unmodifiableSet(belongs);
	}

	protected Set<Belongs> _getBelongs() {
		return belongs;
	}

	protected void setBelong(Set<Belongs> belongs) {
		this.belongs = belongs;
	}

	public void addBelongs(Belongs bel) {
		bel.setUser(this);
		this.belongs.add(bel);
	}

	public void removeBelongs(Belongs bel) {
		this.belongs.remove(bel);
		bel.setUser(null);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PermissionLevel getPermission() {
		return permission;
	}

	public void setPermission(PermissionLevel permission) {
		this.permission = permission;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
