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
import javax.persistence.Table;
@Entity
@Table(name = "TORGANIZATION")
public class AbstractOrganization implements Serializable {
	
	private static final long serialVersionUID = -4553483857410015950L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "orgBelong")
	private Set<Component> orgBelong = new HashSet<Component>();
	
	@OneToMany(mappedBy = "orgHave")
	private Set<Component> orgHave = new HashSet<Component>();
	
	@OneToMany(mappedBy = "org")
	private Set<Belongs> belongs = new HashSet<Belongs>();
	
	@OneToMany(mappedBy = "provider")
	private Set<UploadDocs> upDocs = new HashSet<UploadDocs>();
	
	public AbstractOrganization() {
	}
	
	public AbstractOrganization(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Belongs> getBelongs() {
		return Collections.unmodifiableSet(belongs);
	}
	
	protected Set<Belongs> _getBelongs() {
		return belongs;
	}
	
	public void addBelongs(Belongs belongs) {
		belongs.setOrg(this);
		this.belongs.add(belongs);	
	}
	
	public void removeBelongs(Belongs belongs){
		this.belongs.remove(belongs);
		belongs.setOrg(null);
	}

	public Set<Component> getOrgBelong() {
		return Collections.unmodifiableSet(orgBelong);
	}

	protected Set<Component> _getOrgBelong() {
		return orgBelong;
	}
	
	public void addOrgBelongs(Component orgbe) {
		orgbe.setOrgBelong(this);
		this.orgBelong.add(orgbe);	
	}
	
	public void removeOrgBelongs(Component orgbe){
		this.orgBelong.remove(orgbe);
		orgbe.setOrgBelong(null);
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
	
	public void removeOrgHave(Component orgha){
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


	

}
