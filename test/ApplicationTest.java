import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import java.util.Collections;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.mvc.Content;
import play.mvc.Http;
import play.mvc.Http.Request;
import play.test.FakeApplication;
import play.test.Helpers;

import java.util.Map;
import java.util.Collections;
import org.junit.*;
import static org.mockito.Mockito.*;
import play.mvc.*;
import play.test.*;
import play.mvc.Http;
import play.mvc.Http.Context;
import play.api.mvc.RequestHeader;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import play.test.WithApplication;
import models.*;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest extends WithApplication {

	@Before
	public void setUp() throws Exception {
		start(fakeApplication(inMemoryDatabase()));

		// Initialization of Context...
		Map<String, String> flashData = Collections.emptyMap();
		Map<String, Object> argData = Collections.emptyMap();
		Long id = 2L;
		play.api.mvc.RequestHeader header = mock(play.api.mvc.RequestHeader.class);
        Http.Request request = mock(Http.Request.class);
		Http.Context context = new Http.Context(id, header, request, flashData, flashData, argData);
		Http.Context.current.set(context);
	}
    
	
	@Test
    public void renderIndex() {
        Content html = views.html.index.render(Observation.all(),Country.all(),Indicator.all());
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("ObservaTerra"); 
    }

}
