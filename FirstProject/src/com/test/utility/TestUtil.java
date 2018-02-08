package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	 static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
		 reader=new Xls_Reader("E:\\myworkspace_selenium\\FirstProject\\src\\com\\testdata\\GmailData.xlsx");
		}catch (Exception e) {
		e.printStackTrace();
		}
			
			for(int rowNum=2;rowNum<=reader.getRowCount("TestData");rowNum++)
			{
				String emailId= reader.getCellData("TestData","EmailID",rowNum);
				String password=reader.getCellData("TestData"," Password",rowNum);
			
			     Object ob[]= {emailId, password};
			     myData.add(ob);
		  
			}
		return myData;
	}

}
