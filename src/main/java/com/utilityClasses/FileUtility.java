package com.utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	/**
	 * Fetches data from a specified cell in an Excel sheet.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		wb.close();
		return data;
	}
	
	/**
	 * Returns the number of rows in a specified Excel sheet.
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	public int getRowCount(String sheetName) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowcount;
	}

	/**
	 * Writes data into a specified cell in an Excel sheet.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Exception
	 */
	public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.excelPath);
		System.out.println(fis);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).createRow(rowNum).createCell(cellNum).setCellValue(data);;

		FileOutputStream fos = new FileOutputStream(UtilityConstants.excelPath);
		wb.write(fos);
		wb.close();
	}

	/**
	 * Fetches data from a properties file using a specified key.
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFiles(String Key) throws Exception {
		FileInputStream fis = new FileInputStream(UtilityConstants.propertyPath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(Key);
		return data;
	}

	/**
	 * Reads multiple rows and columns from an Excel sheet and stores them in a 2D array.
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String[][] readingMultipleData(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(UtilityConstants.excelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				String dataFromCell = sheet.getRow(i).getCell(j).toString();
				data[i][j] = dataFromCell;
			}
		}
		return data;
	}
}
