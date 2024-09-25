package TestingBaba_Pages;

import baselibrary.BaseLibrary;

public class LoginPage extends BaseLibrary
{
	
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println("Testing Baba Title is "+title);
		
	}

}
