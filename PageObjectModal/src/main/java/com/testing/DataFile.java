package com.testing;

public interface DataFile {

	Xls_Reader d = new Xls_Reader("C:\\Users\\patel\\git\\DIT_Selenium\\PageObjectModal\\projectData\\testData.xlsx");
	
	public String URL = d.getCellData("URL", 1, 1);

	public String searchIndia = d.getCellData("SearchData", 1, 1);
	public String searchCanada = d.getCellData("SearchData", 1, 2);
	
}