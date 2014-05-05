package otcrawlers;

import java.io.File;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.BinaryParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import edu.uci.ics.crawler4j.util.IO;

public class DataCrawler extends WebCrawler {

	private static final Logger log = Logger.getLogger(CrawlController.class
			.getName());

	private static final Pattern filters = Pattern
			.compile(".*(\\.(css|js|mid|mp2|mp3|mp4|wav|avi|mov|mpeg|ram|m4v"
					+ "|rm|smil|wmv|swf|wma|zip|rar|gz))$");

	// extensiones de los ficheros que nos interesan
	private static final Pattern dataPatterns = Pattern
			.compile(".*(\\.(pdf|xml|json|csv|xlsx|xls|html))$");// (bmp|gif|jpe?g|png|tiff?))$");

	// almacén de los datos
	private File storageFolder;
	// página raíz
	private String myCrawlDomain;

	// este método se llama al inicio de cada crawling
	@Override
	public void onStart() {
		// configuramos el logger
		PropertyConfigurator.configure("conf/log4j.properties");

		log.debug("begin onStart()...");
		myCrawlDomain = ((String[]) myController.getCustomData())[0];
		storageFolder = new File(((String[]) myController.getCustomData())[1]);
		log.debug("myCrawlDomain=" + myCrawlDomain);
		log.debug("storageFolder=" + storageFolder);
		if (!storageFolder.exists())
			storageFolder.mkdirs();
		log.debug("finished onStart()");
	}

	// este método nos indica si se va a visitar o no la url en cuestión
	@Override
	public boolean shouldVisit(WebURL url) {
		log.debug("starting shouldVisit(...)");
		String href = url.getURL().toLowerCase();
		if (filters.matcher(href).matches()) {
			log.debug("no visit by no filters match");
			return false;
		}

		if (dataPatterns.matcher(href).matches()) {
			log.debug("no visit by no patterns match");
			return true;
		}

		if (href.startsWith(myCrawlDomain)) {
			log.debug("go to visit by startsWith");
			return true;
		}
		log.debug("no visit for any reason");
		return false;
	}

	// método de la visita a la página
	@Override
	public void visit(Page page) {
		log.debug("starting the visit(...)");
		String url = page.getWebURL().getURL();

		if (!(page.getParseData() instanceof BinaryParseData)) {
			log.debug("return by no instanceof BinaryParseData");
			return;
		}

		if (!dataPatterns.matcher(url).matches()) {
			log.debug("return by no dataPatterns match with url");
			return;
		}

		// se va a proceder a guardar el fichero en el almacén
		log.debug("processing datas...");
		// get a unique name for storing this image
		String extension = url.substring(url.lastIndexOf("."));
		log.debug("extension=" + extension);
		String fileName = "";
		if (url.contains("?"))
			fileName = url.substring(url.lastIndexOf("/") + 1,
					url.lastIndexOf("?"));
		else
			fileName = url.substring(url.lastIndexOf("/") + 1);
		log.debug("filename=" + fileName);

		// store file
		log.debug("to write in " + ((String[]) myController.getCustomData())[1]);
		IO.writeBytesToFile(page.getContentData(), storageFolder + "/"
				+ fileName);
		log.info("Stored: " + url);
	}
}