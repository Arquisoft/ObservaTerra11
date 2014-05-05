package models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TDOCUMENTS")
public class UploadDocs implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private static final long serialVersionUID = -616539021693439884L;

	private String area;

	private String indicator;

	private String measure;

	private boolean external_sorce;

	@ManyToOne
	private AbstractOrganization provider;

	@ManyToOne
	 private User user;

	@Temporal(TemporalType.DATE)
	private Date time;

	public UploadDocs() {

	}

	 public UploadDocs(String area, String indicator, String measure,
	 AbstractOrganization provider,User user, Date time, boolean
	 exteralSource) {
	 this.area = area;
	 this.indicator = indicator;
	 this.measure = measure;
	 this.provider = provider;
	 this.user = user;
	 this.time = time;
	 this.external_sorce = exteralSource;
	
	 provider.addUpdoc(this);
	 user.addDoc(this);
	 }

	public void setProvider(AbstractOrganization org) {
		this.provider = org;
	}


	public AbstractOrganization getProvider() {
		return provider;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


	 public User getUser() {
	 return user;
	 }
	
	 public void setUser(User user) {
	 this.user = user;
	 }


	public boolean isExternal_sorce() {
		return external_sorce;
	}

	public void setExternal_sorce(boolean external_sorce) {
		this.external_sorce = external_sorce;
	}

	public void unlink() {

		 this.user.removeDoc(this);
		 this.user = null;

		this.provider.removeUpdoc(this);
		this.provider = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((indicator == null) ? 0 : indicator.hashCode());
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
		UploadDocs other = (UploadDocs) obj;
		if (indicator == null) {
			if (other.indicator != null)
				return false;
		} else if (!indicator.equals(other.indicator))
			return false;
		return true;
	}

}
