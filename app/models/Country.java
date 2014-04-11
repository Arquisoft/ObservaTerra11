package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Country extends Model {
  @Id
  public Long id;
  
  @Required
  public String name;
  
  public Country(String name) {this.name = name;}
   
  public static Finder<Long,Country> finder = 
      new Finder(Long.class, Country.class); 
}
