package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TestingBaba_Pages.CheckBox_Page;
import baselibrary.BaseLibrary;
import java.util.concurrent.TimeUnit;
public class CheckBox_Test extends BaseLibrary {
	CheckBox_Page obj;
	 @BeforeTest
	  public void getLaunchUrl_TestingBaba() throws InterruptedException
	  {
		  getLaunchUrl("https://testingbaba.com/old");
		   obj=new CheckBox_Page();
		   
	  }	  
		 
	
   @Test(priority = 1)		
   public void element()
   {
	   
	   obj.clickonElement();
   }
	
	@Test(priority = 2)
	public void checkBox()
	{
		obj.CheckBox();
	}
	@Test(priority = 3)
	public void checkboxtick()
	{
		obj.checkboxtick();
		
	}
	@Test(priority = 4)
	public void getAftermsg()
	{
		obj.getafterMsg();
	}

}
