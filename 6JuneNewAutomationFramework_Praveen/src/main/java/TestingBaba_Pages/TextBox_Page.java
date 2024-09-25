
package TestingBaba_Pages;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class TextBox_Page extends BaseLibrary
{ 
	public TextBox_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[normalize-space()='elements']")
	private WebElement elements;
	
	@FindBy(xpath ="//*[text()='text box']")
	private WebElement texbox;
	
	@FindBy(xpath = "//*[@id=\"fullname1\"]" ) 
	private WebElement fullname ;
	
	@FindBy(xpath ="//*[@id=\"fullemail1\"]" ) 
	private WebElement email ;
	
	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]" )
	private WebElement CurrentAddress ;
	@FindBy(xpath = "//textarea[@id=\"paddresh1\"]" )
	private WebElement PermanentAdd;
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitbtn;
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement>ListofData;
		
	
	public void clickonElement()
	{
		elements.click();
	} 
	
	public void clickonTextBox()
	{
		texbox.click();
	}
	public void SendData()
	{
      fullname.sendKeys(getReadData(xLpath, 0, 1, 0));	
	  email.sendKeys(getReadData(xLpath, 0, 1, 1));
	  CurrentAddress.sendKeys(getReadData(xLpath, 0, 1, 2));
	  PermanentAdd.sendKeys(getReadData(xLpath, 0, 1, 3));
	}
	
	public void submitbuttonclick()
	{
		submitbtn.click();
	  
	} String actualData;
	public void getdetails() 
	{ int k=0;
	SoftAssert sf=new SoftAssert();
	for(int i=1;i<ListofData.size();i=i+2) {
		  System.out.println(ListofData.get(i).getText());
		  actualData=ListofData.get(i).getText();
		 sf.assertEquals(actualData,getReadData(xLpath,0,1,k));
		 k++;
		 		 
	  } sf.assertAll();
	  
	}
	

}
