package buscador;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


public class BuscadorSteps {
	
	WebDriver driver = new HtmlUnitDriver();
	WebElement element ;
	
	@Dado("^que estoy en la página (.+)$")
	public void que_estoy_en_la_página(String uri) throws Throwable { // NOPMD by Labra on 4/03/14 7:15
		driver.get(uri);
	}

	@Cuando("^voy al campo (.+) y tecleo (.+)$")
	public void tecleo(final String campo, final String texto) throws Throwable {
		element = driver.findElement(By.id(campo));
//		driver.findElement(By.id(campo)).sendKeys(texto);
		element.sendKeys(texto);
        element.submit();
	}

	@Entonces("^obtengo una página que contiene (.+)$")
	public void obtengo_resultados_con_el_texto(final String txt) throws Throwable { 
		assertTrue("Page must contain " + txt, driver.getPageSource().contains(txt));
	}
}