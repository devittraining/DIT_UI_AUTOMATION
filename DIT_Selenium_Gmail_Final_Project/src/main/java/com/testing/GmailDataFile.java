package com.testing;

import java.io.File;

public interface GmailDataFile {

	File data = new File("gmailProjectData");	   
	File dataFile = new File(data, "testData.xlsx");
	
	Gmail_Xls_Reader d = new Gmail_Xls_Reader(dataFile.getAbsolutePath());
	
	public String URL = d.getCellData("URL", 1, 1);

	public String validEmail = d.getCellData("LoginCredentials", 1, 1);
	public String validPassword = d.getCellData("LoginCredentials", 1, 2);
	
	public String invalidEmail = d.getCellData("LoginCredentials", 1, 3);
	public String invalidPassword = d.getCellData("LoginCredentials", 1, 4);
	
	public String wrongEmailErrorMsg = d.getCellData("ErrorMsg", 1, 1);
	public String wrongPasswordErrorMsg = d.getCellData("ErrorMsg", 1, 2);
	
}