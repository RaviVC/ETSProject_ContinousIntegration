package ExcelData;

import Lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("D:\\data.xlsx");
		System.out.println(excel.getData(0, 0, 0 ));

	}

}
