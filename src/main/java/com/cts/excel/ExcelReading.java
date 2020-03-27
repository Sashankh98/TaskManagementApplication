package com.cts.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public String[][] excelread() throws IOException {
		FileInputStream file = new FileInputStream("src/test/resources/Excel/TaskManagement.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("credentials");

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);

		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellCount);

		String[][] main = new String[rowCount - 1][cellCount];

		DataFormatter format = new DataFormatter();

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
				main[i - 1][j] = cellValue;
			}
		}
		book.close();
		file.close();
		return main;

	}

}
