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

		// carpetas donde se almacenan los datos(no se usa por problemas con
		// causa desconocida)
		String[] storageFolders = new String[crawlersInfo.length()];
		// páginas a inspeccionar
		String[] crawlDomains = new String[crawlersInfo.length()];

		// configuraciones de crawlers
		CrawlConfig[] configs = new CrawlConfig[crawlersInfo.length()];
		// buscadores
		PageFetcher[] pageFetchers = new PageFetcher[crawlersInfo.length()];

		// inicializamos las distintas configuraciones(en este caso son todas
		// iguales)
		for (int i = 0; i < crawlersInfo.length(); i++) {
			configs[i] = new CrawlConfig();

			// carpeta-almacén por defecto, todos los datos recolectados irán a
			// esta carpeta independientemente de la naturaleza de los mismos
			storageFolders[i] = "data/datas";
			// crawlersInfo.getJSONObject(i).getString(
			// "folder");
			// log.debug(crawlersInfo.getJSONObject(i).getString("folder"));

			// inicializamos los elementos del array con las páginas a rastrear
			crawlDomains[i] = crawlersInfo.getJSONObject(i).getString("url");

			// ruta con datos intermedios de los crawlers
			configs[i].setCrawlStorageFolder(rootFolder);
			// para permitir el rastreo de contenido binario(imágenes p.e.)
			configs[i].setIncludeBinaryContentInCrawling(true);
			// máximo tamaño de descarga(10 MB)
			configs[i].setMaxDownloadSize(10485760);
			// configs[i].setPolitenessDelay(1000);
			// máima profundidad del árbol de páginas
			configs[i].setMaxDepthOfCrawling(700);

			pageFetchers[i] = new PageFetcher(configs[i]);
		}

		RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		// da igual el pageFetcher que indiquemos, es el mismo para todos los
		// crawlers
		RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig,
				pageFetchers[0]);

		CrawlController[] controllers = new CrawlController[crawlersInfo
				.length()];
		// inicializamos los controladores
		for (int i = 0; i < crawlersInfo.length(); i++) {
			controllers[i] = new CrawlController(configs[i], pageFetchers[i],
					robotstxtServer);
		}

		for (int i = 0; i < crawlersInfo.length(); i++) {
			// datos que contendrá cada controlador, podrán ser accedidos desde
			// el mismo controller
			String[] datas = { crawlDomains[i], storageFolders[i] };
			controllers[i].setCustomData(datas);
			log.debug("Se va a añadir la semilla: " + crawlDomains[i]
					+ " al crawler " + (i + 1));
			// añadir semilla, la página raíz, puede contener varias
			controllers[i].addSeed(crawlDomains[i], i + 1);

			log.debug("vamos a startear la spider " + (i + 1));
			// comenzamos el crawling
			controllers[i]
					.startNonBlocking(DataCrawler.class, numberOfCrawlers);
		}

		for (int i = 0; i < crawlersInfo.length(); i++) {
			// espera a que termine para continuar
			controllers[i].waitUntilFinish();
			log.info("Crawler " + (i + 1) + " is finished.");
		}
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