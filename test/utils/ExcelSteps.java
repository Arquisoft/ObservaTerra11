package utils;

import models.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static models.Observation.average;

import java.io.InputStream;
import java.util.List;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


public class ExcelSteps {

private final ExcelReader reader = new ExcelReader();

private InputStream input;
private List<Observation> obsList;

@Dado("^que obtengo el fichero excel (.+)$")
public void que_obtengo_la_hoja_excel(String xlsFile) throws Throwable {
	input = new ExcelSteps().getClass().getClassLoader()
			.getResourceAsStream(xlsFile);
}

@Cuando("^leo las observaciones$")
public void leo_las_observaciones() throws Throwable {
	obsList = reader.read(input);
}

@Entonces("^el número de observaciones es (\\d+)$")
public void el_número_de_observaciones_es(int expected) throws Throwable {
    assertThat(obsList.size()).isEqualTo(expected);
}

@Entonces("^el valor medio es (.+)$")
public void el_valor_medio_es_(Double expected) throws Throwable {
	assertThat(average(obsList)).isEqualTo(expected,offset(0.001));
}

}