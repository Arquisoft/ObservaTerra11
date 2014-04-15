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
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	private AbstractOrganization organization;
	
	@OneToMany(mappedBy = "user")
	private Set<UploadDocs> uploadDocs = new HashSet<UploadDocs>();

	private boolean activo;
	
	public User() {

		this.activo = true;
	}

	public User(String login, String password, PermissionLevel permission) {
		this.login = login;
		this.password = password;
		this.permission = permission;
		this.activo = true;
	}

	public AbstractOrganization getBelongs() {
		return organization;
	}

	public void setBelong(AbstractOrganization org) {
		this.organization = org;
	}
	
	public Set<UploadDocs> getUploadDocs() {
		return Collections.unmodifiableSet(uploadDocs);
	}
	
	protected Set<UploadDocs> _getUploadDocs() {
		return uploadDocs;
	}
	
	public void addDoc(UploadDocs doc) {
		doc.setUser(this);
		uploadDocs.add(doc);
	}

	public void removeDoc(UploadDocs doc) {
		uploadDocs.remove(doc);
		doc.setUser(null);
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
	
	

}
