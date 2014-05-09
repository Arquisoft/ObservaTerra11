/**
 * Aquí va la configuración del crawler.
 */

package otcrawlers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.JSONArray;
import org.json.JSONObject;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

/**
 * @author: Miguel Navarro Cabrero
 * 
 *          Aquí va la configuración del crawler.
 */

public class CrawlControllers {

	private static final Logger log = Logger.getLogger(CrawlController.class
			.getName());

	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("conf/log4j.properties");

		// leemos el JSON y lo convertimos en un String
		String json = readJSON();

		// JSONArray a partir del String
		JSONArray values = new JSONArray("[" + json + "]");
		JSONObject jo = values.getJSONObject(0);
		// array con todas las páginas a inspeccionar
		JSONArray crawlersInfo = jo.getJSONArray("crawl");
		log.debug(crawlersInfo);
		log.debug(crawlersInfo.get(0));
		log.debug("size of JSONobjects=" + crawlersInfo.length());

		String rootFolder = jo.getString("root");
		// número de crawlers/threads por cada página
		int numberOfCrawlers = jo.getInt("numberOfCrawlers");

		// páginas a inspeccionar
		String[] crawlDomains = new String[crawlersInfo.length()];

		// configuracion de los crawlers
		CrawlConfig config = new CrawlConfig();

		for (int i = 0; i < crawlersInfo.length(); i++) {
			// // inicializamos los elementos del array con las páginas a
			// rastrear
			crawlDomains[i] = crawlersInfo.getJSONObject(i).getString("url");
		}

		// ruta con datos intermedios de los crawlers
		config.setCrawlStorageFolder(rootFolder);

		// para permitir el rastreo de contenido binario(imágenes p.e.)
		config.setIncludeBinaryContentInCrawling(true);

		// máximo tamaño de descarga(10 MB)
		config.setMaxDownloadSize(10485760);

		PageFetcher pageFetcher = new PageFetcher(config);

		RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig,
				pageFetcher);

		CrawlController controller = new CrawlController(config, pageFetcher,
				robotstxtServer);

		// añade los dominios
		controller.setCustomData(crawlDomains);

		// añadir semilla, la página raíz, puede contener varias
		for (String domain : crawlDomains) {
			log.debug("Se va a añadir la semilla: " + domain + " al crawler ");
			controller.addSeed(domain);
		}

		log.debug("vamos a startear la spider");
		// comenzamos el crawling
		controller.start(DataCrawler.class, numberOfCrawlers);
		log.info("Crawler is finished.");
	}

	// lee el .json y lo convierte en un String
	private static String readJSON() throws IOException {
		log.debug("Starting to create String from JSON");
		String json = "";

		BufferedReader br = new BufferedReader(new FileReader(
				"conf/domains.json"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			json = sb.toString();
			log.debug(json);
		} finally {
			br.close();
			log.debug("JSON buildt like a String");
		}
		return json;
	}
}