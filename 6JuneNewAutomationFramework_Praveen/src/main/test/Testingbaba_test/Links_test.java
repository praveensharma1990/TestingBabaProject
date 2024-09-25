package Testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PropertyUtility.propertyUtility;
import TestingBaba_Pages.LinksPage;
import baselibrary.BaseLibrary;

public class Links_test extends BaseLibrary implements propertyUtility {
	LinksPage objLinksPage;
	@BeforeTest
	
	public void launchTestingBaba() throws InterruptedException {
	 	getLaunchUrl(getReadData("url"));
	 	objLinksPage=new LinksPage();
		
	}
	@Test(priority = 1)
	public void elementClick() {
		objLinksPage.elementclick();
		try{
			Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	@Test(priority = 2)
	public void linkclick() {
		objLinksPage.linkClick();
	}
	@Test(priority = 3)
	public void demoLinkclick() {
		objLinksPage.demopageLinkclick();
	}
	@Test(priority = 4)
	public void switchWindow() {
		objLinksPage.switchWindows(0);
		System.out.println(driver.getTitle());
		objLinksPage.switchWindows(1);
		System.out.println(driver.getTitle());
		
	}

}
