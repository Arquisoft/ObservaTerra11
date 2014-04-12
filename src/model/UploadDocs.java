package model;

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
	
	@ManyToOne
	private AbstractOrganization provider;
	
	@Temporal(TemporalType.DATE)
	private Date time;

	public UploadDocs() {

	}

	public UploadDocs(String area, String indicator, String measure,
			AbstractOrganization provider, Date time) {
		this.area = area;
		this.indicator = indicator;
		this.measure = measure;
		this.provider = provider;
		this.time = time;
		
		provider.addUpdoc(this);
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

}
