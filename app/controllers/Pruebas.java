package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import play.libs.F;
import play.libs.F.Promise;
import play.libs.Json;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Pruebas extends Controller {

	/* Ejemplo invocando a Ajax */
	public static Result ajax() {
		return ok(ajax.render());
	}
	
	/* Carga otra página de forma asíncrona */
	public static Promise<Result> proxy(String url) {
		F.Promise<WS.Response> responsePromise = WS.url(url).get();
		return responsePromise.map(new F.Function<WS.Response,Result>(){
			public Result apply(WS.Response response) throws Throwable {
				return ok(response.getBody()).as("text/html");
			}
		});
	}
	
	/* Carga 2 servicios Web en paralelo */
	public static Promise<Result> parallel() {
		final long start = System.currentTimeMillis();
		
		F.Function<WS.Response, Long> timing = new F.Function<WS.Response,Long>() {
			public Long apply(WS.Response response) {
				return System.currentTimeMillis() - start;
			}
		};
		
		final F.Promise<Long> yahoo = WS.url("http://www.yahoo.com").get().map(timing);
		final F.Promise<Long> google = WS.url("http://www.google.com").get().map(timing);
		final F.Promise<Long> bing  = WS.url("http://www.bing.com").get().map(timing);
		
		return F.Promise.sequence(yahoo,google,bing).
				map(new F.Function<List<Long>,Result>() {
			      public Result apply(List<Long> longs) throws Throwable {
			    	  Map<String,Long> data = new HashMap<String,Long>();
			    	  data.put("yahoo",yahoo.get());
			    	  data.put("google",google.get());
			    	  data.put("bing",bing.get());
			    	  return ok(Json.toJson(data));
			      }
				}
		);
	}
	

}
