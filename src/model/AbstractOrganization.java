package model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TORGANIZATION")
public class AbstractOrganization implements Serializable {

	private static final long serialVersionUID = -4553483857410015950L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private boolean activa;

	@OneToOne(mappedBy = "orgBelong")
	private Component orgBelong;

	@OneToMany(mappedBy = "orgHave")
	private Set<Component> orgHave = new HashSet<Component>();

	@OneToMany(mappedBy = "organization")
	private Set<User> users;

	@OneToMany(mappedBy = "provider")
	private Set<UploadDocs> upDocs = new HashSet<UploadDocs>();

	public AbstractOrganization() {
		this.activa = true;
	}

	public AbstractOrganization(String name) {
		this.name = name;
		this.activa = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getBelongs() {
		return Collections.unmodifiableSet(users);
	}

	protected Set<User> _getBelongs() {
		return users;
	}

	public void addBelongs(User user) {
		user.setBelong(this);
		this.users.add(user);
	}

	public void removeBelongs(User belongs) {
		this.users.remove(belongs);
		belongs.setBelong(null);
	}

	public Component getOrgBelong() {
		return orgBelong;
	}

	public void setOrgBelong(Component org) {
		orgBelong = org;
	}

	public Set<Component> getOrgHave() {
		return Collections.unmodifiableSet(orgHave);
	}

	protected Set<Component> _getOrgHave() {
		return orgHave;
	}

	public void addOrgHave(Component orgha) {
		orgha.setOrgHave(this);
		this.orgHave.add(orgha);
	}

	public void removeOrgHave(Component orgha) {
		this.orgHave.remove(orgha);
		orgha.setOrgHave(null);
	}

	public Set<UploadDocs> getUpDocs() {
		return Collections.unmodifiableSet(upDocs);
	}

	protected Set<UploadDocs> _getUpDocs() {
		return upDocs;
	}

	public void addUpdoc(UploadDocs upDoc) {
		upDoc.setProvider(this);
		this.upDocs.add(upDoc);
	}

	public void removeUpdoc(UploadDocs upDoc) {
		this.upDocs.remove(upDoc);
		upDoc.setProvider(null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		AbstractOrganization other = (AbstractOrganization) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
