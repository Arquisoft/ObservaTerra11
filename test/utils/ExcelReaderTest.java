package utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.io.InputStream;
import java.util.List;

import models.*;
import static models.Observation.average;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import play.test.FakeApplication;
import play.test.Helpers;


public class ExcelReaderTest {
	  
	public static FakeApplication app;
	  
	@BeforeClass
	public static void startApp() {
	  app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
	  Helpers.start(app);
	  Observation.deleteAll();
	}
	  
	@Test
	public void readExcelFile() throws Throwable {
	  String xlsFile = "test.xlsx";
	  InputStream input = new ExcelReaderTest().getClass().getClassLoader()
						  .getResourceAsStream(xlsFile);
	  ExcelReader excelReader = new ExcelReader();
	  List<Observation> obsList = excelReader.read(input);
	  for (Observation obs: obsList) {
		  obs.save();
	  }
	  assertThat(average(Observation.all())).isEqualTo(3.325,offset(0.001));
	}
	
	@AfterClass
	  public static void stopApp() {
	    Helpers.stop(app);
	  }
}
