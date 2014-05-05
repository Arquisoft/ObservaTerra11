package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;


@Entity
public class Observation extends Model {
    
  @Id
  public Long id;
  
  @Required
  public Double obsValue;
  
  @ManyToOne
  public Country country;

  @ManyToOne
  public Indicator indicator;
  
  public static Finder<Long,Observation> find = new Finder(Long.class, Observation.class);

  public Observation(Country country, Indicator indicator, Double value) {
	  this.country = country;
	  this.indicator=indicator;
	  this.obsValue = value ;
  }
  
  public Observation(String countryCode, String indicatorCode, Double value) {
	  this.country  = Country.find.ref(countryCode);
	  this.indicator= Indicator.find.ref(indicatorCode);
	  this.obsValue = value ;
  }

  public static List<Observation> all() {
    return find.all();
  }

  public static Observation create(String code, String indicator, Double value) {
	  Observation observation = new Observation(code,indicator,value);
	  observation.save();
	  return observation;
  }
  
  public static void delete(Long id) {
	find.ref(id).delete();
  }
  
  public static void deleteAll() {
	for (Observation obs: all()) {
		obs.delete();
	}
  }
  
  public static Double average(List<Observation> observations) {
	  Double sum = 0.0;
		for (Observation obs : observations) {
			sum += obs.obsValue;
		}
		return sum / observations.size() ;
  }

  public static List<Observation> filterByIndicatorName(String indicatorName, List<Observation> observations) {
	List<Observation> result = new ArrayList<Observation>();
	for (Observation obs : observations) {
		if (obs.indicator.name == indicatorName) result.add(obs);
	}
	return result;
  }


  public static List<Observation> findByIndicatorName(String indicatorCode) {
	Indicator ind = Indicator.findByCode(indicatorCode);
	List<Observation> result = find.where().eq("indicator", ind).findList();
	return result;
  }

  public static List<Observation> findByCountryCode(String countryCode) {
	Country c = Country.find.byId(countryCode);
	List<Observation> result = find.where().eq("country", c).findList();
	return result;
  }

}