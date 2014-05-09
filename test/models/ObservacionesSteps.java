package models;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dada;
import cucumber.api.java.es.Entonces;
import models.Observation;
import static models.Observation.*;


public class ObservacionesSteps {

	private List<Observation> observationList; 
	private Double media;

	@Dada("^una lista de observaciones:$")
	public void una_lista_de_observaciones(final List<ObservationRow> observations) 
			throws Throwable {
		observationList = new ArrayList<Observation>();
		for (ObservationRow obs : observations) {
			Country country = new Country(obs.country,obs.country);
			Indicator ind = new Indicator(obs.indicator,obs.indicator);
			observationList.add(
				new Observation(country, ind, obs.value)
			);
        }
	}

	@Cuando("^selecciono las observaciones con el indicador (.+)")
	public void selecciono_las_observaciones_con_indicador(String indicator) throws Throwable {
		observationList = filterByIndicatorName(indicator,observationList);
	}

	@Cuando("^calculo la nota media$")
	public void calculo_la_nota_media() throws Throwable {
		media = average(observationList);
	}

	@Entonces("^obtengo el valor (.+)$") 
	public void obtengo_el_valor(Double expected) throws Throwable {
		assertEquals(expected,media,0.001);
	}

	@Dada("^una observación del país (.+) con indicador (.+) y valor (.+)$")
	public void una_observación_(String nombre, String indicator, Double value) throws Throwable {
		observationList = new ArrayList<Observation>();
		Country country = new Country(nombre,nombre);
		Indicator ind   = new Indicator(indicator,indicator);
		observationList.add(new Observation(country, ind, value));
	}

	public static class ObservationRow {
        private String country;
        private String indicator;
        private Double value;
    }	
}