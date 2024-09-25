package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PropertyUtility.propertyUtility;
import TestingBaba_Pages.Button_Page;
import baselibrary.BaseLibrary;

public class Button_Test extends BaseLibrary implements propertyUtility {
	Button_Page obj;
	@BeforeTest
	public void launchTestingBabaUrl() throws InterruptedException {
		getLaunchUrl(getReadData("url"));
		obj=new Button_Page();
	}
	
	@Test(priority = 0)
	public void element_click() throws InterruptedException {
		obj.element_Click();
		Thread.sleep(1000);
	}
	@Test(priority = 1)
	public void button_click() {
		obj.buttons_Click();
	}
	
	@Test(priority = 2)
	  public void doubleClick() throws InterruptedException
	   {
		obj.doubleClick();  
		   
	   } 
	    @Test(priority = 3)
	   public void rightClick() {
		   
		   obj.rightClick();;
	   }
	   @Test(priority = 4)
	   public void singleClick() {
		   obj.singleClick();
	   }
	   @Test(priority = 5)
	   public void Readdatafrompropfile() {
		   obj.getReaddatafromPropfile();
	   }

	

}
