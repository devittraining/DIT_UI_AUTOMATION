package com.testing;

import java.io.File;

public interface GmailDataFile {

	File data = new File("gmailProjectData");	   
	File dataFile = new File(data, "testData.xlsx");
	
	Gmail_Xls_Reader d = new Gmail_Xls_Reader(dataFile.getAbsolutePath());
	
	public String URL = d.getCellData("URL", 1, 1);

	public String email = d.getCellData("LoginCredentials", 1, 1);
	public String password = d.getCellData("LoginCredentials", 1, 2);
	
}