package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TCOMPOSEDBY")
public class Component implements Serializable {

	private static final long serialVersionUID = 733926216731815257L;

	@Id
	@ManyToOne
	private AbstractOrganization orgHave;
	
	@OneToOne
	private AbstractOrganization orgBelong;
	
	
	public Component() {
		
	}
	
	public Component(AbstractOrganization orgBelong,AbstractOrganization orgHave) {
		this.orgBelong = orgBelong;
		this.orgHave = orgHave;
	}

	public AbstractOrganization getOrgBelong() {
		return orgBelong;
	}

	public void setOrgBelong(AbstractOrganization orgBelong) {
		this.orgBelong = orgBelong;
	}

	public AbstractOrganization getOrgHave() {
		return orgHave;
	}

	public void setOrgHave(AbstractOrganization orgHave) {
		this.orgHave = orgHave;
	}

	
	

}
