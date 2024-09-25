package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PropertyUtility.propertyUtility;
import TestingBaba_Pages.Alert_page;
import baselibrary.BaseLibrary;

public class Alert_Test extends BaseLibrary implements propertyUtility
{
	Alert_page objAlert_page;
	@BeforeTest
	public void launchTestingBaba_Website() throws InterruptedException {
		getLaunchUrl(getReadData("url"));
		objAlert_page=new Alert_page();
	}
	@Test(priority = 0)
	public void Click_WindowsAndAlert() {
		 objAlert_page.Click_WindowsAndAlert();
		
	 }

	@Test(priority = 1)
	 public void click_Alet() {
		 
		 objAlert_page.click_Alet();
		 
	 }
	@Test(priority = 2)
	 public void alert1() {
		objAlert_page.alert1();
	}
		@Test(priority = 3)
	  public void alert2() throws InterruptedException
		{
	  objAlert_page.alert2();
		
	}
		 
	   @Test(priority = 4)
	  public void alert3() throws InterruptedException 
	 {
		 objAlert_page.alert3();
	 }  
	 @Test(priority = 5)
	 public void alert4()
	 {
		 objAlert_page.alert4();
		 
	 }

	
	
	
	

}
