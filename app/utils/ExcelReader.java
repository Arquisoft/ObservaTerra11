package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import models.Observation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public List<Observation> read(InputStream input) throws IOException {
	  List<Observation> obsList = new ArrayList<Observation>();
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(input);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  for (Row row : sheet) {
		  if (row.getRowNum() == 0) { // skip headers
			  
		  } else {
			String countryName = "";
			String indicatorName = "";
			Double value = 0.0;

			for (Cell cell : row) {
				if (cell.getColumnIndex() == 0) {
					countryName = cell.getStringCellValue();
				}
				if (cell.getColumnIndex() == 1) {
					indicatorName = cell.getStringCellValue();
				}
				if (cell.getColumnIndex() == 2) {
					value = cell.getNumericCellValue();
				}
			}
			if (!countryName.equals("")) {
				Observation obs = new Observation(countryName, indicatorName, value);
				obsList.add(obs);
			} 
		  }
		}

	  return obsList;
	}
}