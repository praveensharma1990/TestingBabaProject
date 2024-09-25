package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestingBaba_Pages.DatePicker_page;
import baselibrary.BaseLibrary;

public class datePicker_test extends BaseLibrary {
	DatePicker_page obj;
	@BeforeTest
	public void launchTestingBabaURl() throws InterruptedException 
	{    
		getLaunchUrl(getReadData("url"));
		obj=new DatePicker_page();
	}
	
	@Test(priority = 1)
	public void clickOn_Widgets_datePicker() {
		obj.clickOn_Widgets_datePicker();
	}
	@Test(priority = 2)
	public void select_Date() {
		obj.select_Date();
	}
   
}
