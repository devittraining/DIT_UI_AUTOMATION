package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLocatorsFile {

	@FindBy(id = "identifierId") public WebElement emailTextField;
	@FindBy(id = "identifierNext") public WebElement emailNextBtn;
	@FindBy(xpath = "//div[@class=\"CxRgyd\"]/div/div[1]/div/div[2]/div[2]/div") public WebElement wrongEmailActualErrorMsg;
	@FindBy(name = "password") public WebElement passwordTextField;
	@FindBy(xpath = "//div[@class=\"bCAAsb\"]/form/span/section/div/div/div[1]/div[2]") public WebElement wrongPasswordActualErrorMsg;
	@FindBy(id = "passwordNext") public WebElement passwordNextBtn;
	
	@FindBy(xpath = "(//*[@class=\"ts\"])[2]") public WebElement firstPageEmailCount;
	@FindBy(xpath = "(//*[@class=\"ts\"])[3]") public WebElement totalEmailCount;
	
	@FindBy(xpath = "(//*[@role=\"checkbox\"])[2]") public WebElement selectEmailFromInbox;
	@FindBy(xpath = "//*[@class=\"bzn\"]/div/div[4]/div[1]") public WebElement moveToTrashBtn;
	@FindBy(xpath = "(//*[@role=\"menuitem\"]/div)[14]") public WebElement trashOptionFromMoveTo;

	@FindBy(xpath = "//*[@gh=\"mll\"]") public WebElement moreOptionFromMenu;
	@FindBy(xpath = "//*[@aria-label=\"Trash\"]") public WebElement trashOptionFromMenu;
	@FindBy(xpath = "(//table[@role=\"grid\"])[4]/tbody/tr[1]/td[2]/div") public WebElement selectEmailFromTrash;
	@FindBy(xpath = "//div[@gh='mtb']/div[@class='bzn']/div/div[5]/div[@title='Move to']") public WebElement moveToInboxBtn;
	@FindBy(xpath = "//div[@role='menuitem' and @act='304'][@aria-hidden='false']") public WebElement inboxOptionFromMoveTo;
	@FindBy(xpath = "//span[@class='ait']") public WebElement lessOptionFromMenu;
	@FindBy(linkText = "Inbox") public WebElement inboxFromMenu;
	
	@FindBy(xpath = "(//tr[@role=\"row\"])[1]/td[9]") public WebElement emailDate;
	@FindBy(xpath = "(//tr[@role=\"row\"])[1]/td[10]/ul/li[3]") public WebElement readUnreadEmailButton;
	@FindBy(xpath = "//*[@data-tooltip=\"Inbox\"]/div/div[2]/div") public WebElement readUnreadEmailCount;
}
