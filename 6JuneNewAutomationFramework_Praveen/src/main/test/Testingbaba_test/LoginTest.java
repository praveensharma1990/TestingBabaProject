package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestingBaba_Pages.LoginPage;
import baselibrary.BaseLibrary;

public class LoginTest extends BaseLibrary
{   
	LoginPage obj;
	@BeforeTest
	public void getLaunchUrlTestingbaba() throws InterruptedException
	{
		
		getLaunchUrl("https://testingbaba.com/old");
		obj =new LoginPage();
		
	}
	 @Test
	 public void getTestingBabaTitle()
	 {
		 obj.getTitle();
	 }
	 

}
