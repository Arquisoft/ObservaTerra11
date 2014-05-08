import play.*;
import play.libs.*;

import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {

	public void onStart(Application app) {
        InitialData.insert(app);
    }
    
	static class InitialData {
		public static void insert(Application app) {
			if (Country.all().isEmpty()) {
				
				@SuppressWarnings("unchecked")
				Map<String,List<Object>> all =
						(Map<String,List<Object>>)Yaml.load("initial-data.yml");
 				Ebean.save(all.get("countries")); 
				Ebean.save(all.get("indicators"));
				
				// Some observations
				new Observation("es","hdi",2.3).save();
				new Observation("fr","hdi",3.4).save(); 
				new Observation("it","hdi",3.0).save();
			}
		}
	}
}
