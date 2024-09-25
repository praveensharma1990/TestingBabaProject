package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestingBaba_Pages.Webtable_Page;
import baselibrary.BaseLibrary;

public class Webtable_test extends BaseLibrary {
	Webtable_Page obj;
	@BeforeTest
	public void launchTestingBabaURl() throws InterruptedException 
	{    
		getLaunchUrl(getReadData("url"));
		obj=new Webtable_Page();
			
	}
	 @Test(priority = 1)	
	public void element_click() throws InterruptedException 
	 {
		obj.element_click();
		Thread.sleep(1000);
	 }
	 @Test(priority = 2)
	public void webtable_click()
	{
		obj.webtable_click();
	} 
	@Test(priority = 3)	
	public void fillDetails()
	{		
		obj.fillDetails();
	}
	
	@Test(priority = 4)
	public void nameVarification() {
		obj.nameVarification();
	}
	@Test(priority = 5)
	public void emailvarification() {
		obj.emailVarification();
		
	}
	@Test(priority = 6)
	public void updatename() 
	{
		obj.updatedName();
	}
	@Test(priority=7)
	public void updateEmail() {
		obj.updateEmail();
	}
	@Test(priority = 8)
	public void nameValidationAfterUpdate() {
		
		obj.namevalidationAfterUpdatetion();
	} @Test(priority = 9)
	 public void emailValidationnAfterUpdate() {
		obj.emailValidationAfterUpdation();
	}
	}
	


