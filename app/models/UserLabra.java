package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.JsonNode;

import play.db.ebean.Model.Finder;
import play.libs.Json;

@Entity
public class UserLabra {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4292000780318727944L;
		@Id
		public String code;
		public String name;
		public String email;
		public String password;

		public UserLabra(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public UserLabra(String code, String name,String email, String password){
			this.code = code;
			this.name = name;
			this.email = email;
			this.password = password;
		}

		public static Finder<String, UserLabra> find = new Finder<String, UserLabra>(
				String.class, UserLabra.class);

		public static List<UserLabra> all() {
			return find.all();
		}

		public static void create(UserLabra user) {
			if (UserLabra.findByEmail(user.email) == null) {
				user.save();
			}
		}

		private void save() {
			//porque hay un metodo save sin parametros????
			
		}

		/**
	     * Authenticate a User.
	     */
	    public static UserLabra authenticate(String email, String password) {
	        return find.where()
	            .eq("email", email)
	            .eq("password", password)
	            .findUnique();
	    }

		public static void remove(String code) {
			find.ref(code).delete();
		}

		public static void deleteAll() {
			for (UserLabra c : all())
				c.delete();
		}

		private void delete() {
			//no hace nada no se porque este metodo no existia
			
		}

		public static UserLabra findByEmail(String email) {
			return find.where().eq("email", email).findUnique();
		}

		public static UserLabra findByCode(String code) {
			return find.byId(code);
		}

		public static JsonNode toJson(UserLabra country) {
			return Json.toJson(country);
		}

		public static UserLabra save(String code, String name, String email,
				String password) {
			return new UserLabra(code,name,email,password);
		}
	}

