package models;

import java.util.List;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;


@Entity
public class Indicator extends Model {
    
  @Id
  public String code;
  
  @Required
  public String name;
  
  public Indicator(String code, String name) {
	  this.code = code;
	  this.name = name;
  }
   
  public static Finder<String,Indicator> find = new Finder(String.class, Indicator.class);
  
  public static List<Indicator> all() {
    return find.all();
  }
  
  public static void create(Indicator indicator) {
	if (Indicator.findByName(indicator.name) == null) { 
			indicator.save();
	}
  }
  
  public static void remove(String id) {
	find.ref(id).delete();
  }
  
  public static void deleteAll() {
    for (Indicator ind: all()) ind.delete();
  }


  public static Indicator findByName(String name) {
	  return find.where().eq("name", name).findUnique();
  }

  public static Indicator findByCode(String code) {
	  return find.byId(code);
  }

}