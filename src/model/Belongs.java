package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.types.BelongKey;


@IdClass(BelongKey.class)
@Entity
@Table(name = "TPERTENECE")
public class Belongs implements Serializable{

	private static final long serialVersionUID = -8962464785623050207L;

	@Id
	@ManyToOne
	private User user;

	@Id
	@ManyToOne
	private AbstractOrganization org;

	public Belongs() {

	}

	public Belongs(User user, AbstractOrganization org) {
		this.org = org;
		this.user = user;
		user.addBelongs(this);
		org.addBelongs(this);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AbstractOrganization getOrg() {
		return org;
	}

	public void setOrg(AbstractOrganization org) {
		this.org = org;
	}
}
