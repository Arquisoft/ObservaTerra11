package api;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static play.test.Helpers.*;
import gherkin.deps.com.google.gson.JsonArray;
import play.Logger;
import play.mvc.*;
import play.mvc.Results.Redirect;
import play.test.*;

import org.junit.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import models.*;



public class CountryTest extends WithApplication {
	  
	ObjectMapper jsonMapper = new ObjectMapper();
	
	@Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase()));
        Observation.deleteAll();
        Country.deleteAll();
        Indicator.deleteAll();
    }
	
	@Test
	public void getCountry() throws Exception {
		Country spain = new Country("es","Spain");
		spain.save();

		JsonNode jsonSpain = Country.toJson(spain);

		Result result = callAction(controllers.routes.ref.API.country("es"));
		
		assertThat(status(result)).isEqualTo(OK);
		assertThat(contentType(result)).isEqualTo("application/json");
		
		JsonNode returned = jsonMapper.readTree(contentAsString(result));
		
		assertEquals(jsonSpain, returned);
	}

	@Test
	public void getCountries() throws Exception {
		
		// Create 2 countries and save them in db
		Country spain = new Country("es","Spain");
		spain.save();
		Country france = new Country("fr","France");
		france.save();

		// generate the corresponding Json
		JsonNodeFactory factory = JsonNodeFactory.instance;
        ArrayNode expected = new ArrayNode(factory);
		expected.add(Country.toJson(spain));
		expected.add(Country.toJson(france));
		
		Result result = callAction(controllers.routes.ref.API.countries());
		
		assertThat(status(result)).isEqualTo(OK);
		assertThat(contentType(result)).isEqualTo("application/json");
		
		JsonNode returned = jsonMapper.readTree(contentAsString(result));
		
		assertEquals(expected, returned);
	}

	@Test
	public void addCountry() throws Exception {
		
		JsonNodeFactory factory = JsonNodeFactory.instance;
		
		Country spain = new Country("es","Spain");
		JsonNode jsonSpain = Country.toJson(spain);
		
		FakeRequest request = fakeRequest("POST", "/api/country").withJsonBody(jsonSpain);

		Result result = callAction(controllers.routes.ref.API.addCountry(), 
				  fakeRequest().
				  withHeader("Content-Type", "application/json").
				  withJsonBody(jsonSpain));
		
		assertThat(status(result)).isEqualTo(SEE_OTHER);
		
		String location = header(LOCATION,result); 
		assertEquals(location, "/api/country");
		
		Result result2 = routeAndCall(fakeRequest(GET, location));;
		assertThat(status(result2)).isEqualTo(OK);
		assertThat(contentType(result2)).isEqualTo("application/json");
		
		JsonNode returned = jsonMapper.readTree(contentAsString(result2));
		
        ArrayNode expected = new ArrayNode(factory);
		expected.add(jsonSpain);
		
		assertEquals(expected, returned);
		
	}


}
