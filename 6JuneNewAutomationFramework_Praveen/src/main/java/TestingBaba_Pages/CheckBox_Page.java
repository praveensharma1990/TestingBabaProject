package TestingBaba_Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;
import bsh.This;

public class CheckBox_Page extends BaseLibrary 
{
 	
  public CheckBox_Page()
 { 
	  PageFactory.initElements(driver, this);
	
 }
  @FindBy(xpath = "//button[@data-target=\"#elements\"]")	
  private WebElement element;
  @FindBy(xpath = "//*[text()='check box']")
  private WebElement checkbox;
  @FindBy(xpath = "//iframe[@class=\"embed-responsive-item\"]")
  private WebElement fram1;
  @FindBy(xpath ="//*[@type='checkbox' and contains(@id,'my')]")
  private List<WebElement> checkboxes;
  @FindBy(xpath = "//h6[contains(@id,'text')]")
  private List<WebElement> aftermsg;
  
public void clickonElement()
{
	element.click();
} 
	
public void CheckBox()

 {
  checkbox.click();
  	  
 }
 public void checkboxtick() 
    { 
	 driver.switchTo().frame(fram1);
	for(int i=0;i<=checkboxes.size()-1;i++)
    checkboxes.get(i).click();
	 System.out.println("Number of checkboxes selected "+checkboxes.size());
	
  } public void getafterMsg() 
  {  for(int i=0;i<=aftermsg.size()-1;i++)
  {  System.out.println(aftermsg.get(i).getText());
     String nameString=aftermsg.get(i).getText();
     Assert.assertEquals(nameString, getReadData(xLpath, 1, i+1, 1));
     System.out.println("Data Matched");
	 
  }
	  
  }
 
  }	
	

