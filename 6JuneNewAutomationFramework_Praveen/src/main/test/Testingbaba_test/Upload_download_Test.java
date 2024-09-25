package Testingbaba_test;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PropertyUtility.propertyUtility;
import TestingBaba_Pages.Upload_downloadPage;
import baselibrary.BaseLibrary;

public class Upload_download_Test extends BaseLibrary implements propertyUtility{
	Upload_downloadPage obj;
	@BeforeTest
	public void launchTesting_Baba_Url() {
		try {
			getLaunchUrl(getReadData("url"));
			obj =new Upload_downloadPage();
		} catch (InterruptedException e) {
			System.out.println("there is some issue in launching URL");
			e.printStackTrace();
		}
	}
	@Test(priority = 1)
	public void element_click() {
		obj.Click_On_Element();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void Upload_Download_click() {
		obj.Click_On_UploadAndDownload();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3)
	public void fileUpload() {
		obj.file_Upload("C:\\Users\\LENOVO\\eclipse-workspace\\6JuneNewAutomationFramework_Praveen\\testdata\\config.properties");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    @Test(priority = 4)
    public void download_file() {
    	obj.download_file();
    }

}
