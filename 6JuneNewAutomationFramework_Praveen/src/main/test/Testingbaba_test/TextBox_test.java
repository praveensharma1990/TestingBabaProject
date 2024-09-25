package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestingBaba_Pages.TextBox_Page;
import baselibrary.BaseLibrary;

public class TextBox_test extends BaseLibrary 
{
  TextBox_Page ob;
  
  @BeforeTest
  public void getLaunchUrl_TestingBaba() throws InterruptedException
  {
	  getLaunchUrl("https://testingbaba.com/old/");
	  ob=new TextBox_Page();
  }
   @Test(priority = 1)
  public void clickonElement()
  {
	  ob.clickonElement();
  } 
  @Test(priority = 2)
  public void textbox() {
	 ob.clickonTextBox();
  }
  @Test(priority = 3)
  public void SendDataFullName() {
	  ob.SendData();
	 
  }    @Test(priority = 4)
       public void submitbutton() 
    {
	  ob.submitbuttonclick();
    }
  @Test(priority = 5)
  public void getdetails()
  {
	  ob.getdetails();
  }
}  