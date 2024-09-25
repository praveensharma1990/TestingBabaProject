package TestingBaba_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Upload_downloadPage extends BaseLibrary{
	
	public Upload_downloadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()=\"elements\"]")
	private WebElement element;
	@FindBy(xpath = "//a[normalize-space()=\"upload and download\"]")
	private WebElement upload_and_download;
	@FindBy(xpath = "//input[@id=\"File1\"]")
	private WebElement file_upload;
	@FindBy(xpath ="//a[normalize-space()=\"Download\"]" )
	private WebElement file_download;
	
	
	public void Click_On_Element()
	{
		
		element.click();
	}
	public void Click_On_UploadAndDownload() {
		upload_and_download.click();
	}
	
	public void file_Upload(String filePath) {
		
		file_upload.sendKeys(filePath);
	}
	public void download_file() {
		file_download.click();
	}


}
