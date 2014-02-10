package es.uniovi.asw.observaTerra;

public class Country implements Comparable<Country>{
	private String name;
	
	public Country(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}
	
	public int compareTo(Country other) {
       return name.compareTo(other.name);
    }
}
