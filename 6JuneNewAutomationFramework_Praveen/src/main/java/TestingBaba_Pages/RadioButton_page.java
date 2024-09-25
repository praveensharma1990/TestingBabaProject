package TestingBaba_Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;
import jakarta.xml.bind.Element;

public class RadioButton_page extends BaseLibrary 
{
	
  public RadioButton_page()
	{
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath = "//button[@data-target=\"#elements\"]")	
    private WebElement element; 
	@FindBy(xpath ="//a[normalize-space()='radio buttons']")
	private WebElement radioButton;
    			
	@FindBy(xpath = "//div[@class=\"form-check-inline\"]")
	private List<WebElement> radiobuttonSelectorsElement;
	@FindBy(xpath = "//*[@id=\"radio-content\"]")
	private WebElement successmsgElement;
	
	public void element()
	{
		element.click();
	}
	
	public void radiobutton_Click() 
	{
		
		radioButton.click();
	}
	
	public void Radiobuttons_selects()
	{   System.out.println("Hi this is radioButton Selection Test"); 
		System.out.println(radiobuttonSelectorsElement.size());
		for(int i=0;i<=radiobuttonSelectorsElement.size()-1;i++)
		{
			radiobuttonSelectorsElement.get(i);
			if(i==0) {
				
				radiobuttonSelectorsElement.get(i).click();
				String successMsg1=successmsgElement.getText();
				Assert.assertEquals("You have selected yes",successMsg1);
				System.out.println("you have clicked on yes");
			}
			if(i==1) 
			{
			
			radiobuttonSelectorsElement.get(i).click();
			String successMsg2=successmsgElement.getText();
			Assert.assertEquals("You have selected impressive",successMsg2);
			System.out.println("you have clicked on impressive");
		    }   if(i==2) 
		       {
			    radiobuttonSelectorsElement.get(i).click();
			    String successMsg3=successmsgElement.getText();
				Assert.assertEquals("You have selected no",successMsg3);
				System.out.println("you have clicked on No");
			   }
		}
				
			}
		
	}
	
	
	


