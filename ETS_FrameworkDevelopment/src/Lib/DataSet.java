package Lib;

import org.testng.annotations.DataProvider;


public class DataSet {

	
	@DataProvider(name="ETSusernamePwd")
	public Object [][] passData()
	{
		 ExcelDataConfig config = new ExcelDataConfig("C:\\TechnicalProject\\Workpace\\ETS_Automation_Project\\TestData\\ExcelInputData.xlsx");
		 
		 int rows = config.getRowCount(0);
		 Object[][] data = new Object[rows][2];
		 
		 for(int i=0;i<rows;i++)
		 {
			 System.out.println("row data is -->"+config.getData(0, i, 0));
			 data[i][0] = config.getData(0, i, 0);
			 data[i][1] = config.getData(0, i, 1);
		 }
		 return data;
		
	}
	
	
	@DataProvider(name="cretingusername")
	public Object [][] createAccount()
	{
		 ExcelDataConfig config = new ExcelDataConfig("C:\\TechnicalProject\\Workpace\\ETS_Automation_Project\\TestData\\ExcelInputData.xlsx");
		 int rows = config.getRowCount(0);
		 Object[][] data = new Object[rows][2];
		 
		 for(int i=0;i<rows;i++)
		 {
			 data[i][0] = config.getData(0, i, 0);
			 data[i][1] = config.getData(0, i, 1);
		 }
		 return data;
		 
	}
	
}
