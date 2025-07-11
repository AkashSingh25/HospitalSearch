package testCases;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import utilities.ExcelUtility;
public class TC00X_WriteExcelTopCities extends BaseClass{
	
	@Test
	public void writeExcelData() throws IOException {
		
		String path = "testData/ReadAndWriteData.xlsx";
		
		ExcelUtility xlUtil = new ExcelUtility(path);
		//int arrCount = 0;
		
		//ArrayList<String> ls=(ArrayList<String>) Arrays.asList("kol","au","sacas","saca","asc","sac","sca","sac");
		
		int row = 3;
        for (String city : names) {
            xlUtil.setCellData("TopCities", row++, 1, city);
        }
		System.out.println();
		System.out.println("***** Data Written in Excel File *****");
		System.out.println();
	}
}
