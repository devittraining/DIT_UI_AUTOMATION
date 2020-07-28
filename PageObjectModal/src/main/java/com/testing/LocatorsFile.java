package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

	@FindBy(xpath = "//*[@title=\"Search\"]") public WebElement searchField;

}
