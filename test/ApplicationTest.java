import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;

import java.util.Collections;
import java.util.Map;

import model.Country;
import model.Indicator;
import model.Observation;

import org.junit.Before;
import org.junit.Test;

import play.mvc.Content;
import play.mvc.Http;
import play.test.WithApplication;

/**
 * 
 * Simple (JUnit) tests that can call all parts of a play app. If you are
 * interested in mocking a whole application, see the wiki for more details.
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
		Http.Context context = new Http.Context(id, header, request, flashData,
				flashData, argData);
		Http.Context.current.set(context);
	}

	@Test
	public void renderIndex() {
		Content html = views.html.index.render();
		assertThat(contentType(html)).isEqualTo("text/html");
		assertThat(contentAsString(html)).contains("ObservaTerra");
	}

}
