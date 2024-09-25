package Testingbaba_test;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestingBaba_Pages.RadioButton_page;
import baselibrary.BaseLibrary;

public class RadioButton_Test extends BaseLibrary
{
	RadioButton_page obj;
	
	@BeforeTest
	
	public void launchTestingBabaURL() throws InterruptedException {
		
	    getLaunchUrl("https://testingbaba.com/old");
	    obj=new RadioButton_page();
	}
	@Test(priority = 1)
	public void element() throws InterruptedException
	   {
		  obj.element();
		  Thread.sleep(1000);
	   }
	
	@Test(priority = 2)
	 public void radioButton_Click() 
	 {
		obj.radiobutton_Click();
	 }
	@Test(priority = 3)
	 public void radioButtons_Select() 
	 {
		obj.Radiobuttons_selects();
	 }
	
			
}
	


