package TestingBaba_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Alert_page extends BaseLibrary {
	
	public Alert_page() {
		PageFactory.initElements(driver,this);
	}

 @FindBy(xpath = "//a[normalize-space()=\"alerts\"]")
 private WebElement alert;
 @FindBy(xpath = "//button[@onclick='myalert()']")
 private WebElement alert1;
 @FindBy(xpath = "//button[@onclick='myconfirm()']")
 private WebElement alert2;
 @FindBy(xpath = "//button[@onclick='aftersec5()']")
 private WebElement alert3;
 @FindBy(xpath = "//button[@onclick='myprompt()']")
 private WebElement alert4;  
 @FindBy(xpath = "//span[@id=\"confirm-result\"]")
 private WebElement afterAlertMessagElement;
 @FindBy(xpath = "//span[text()=\"&Windows\"]")
 private WebElement alert_WindowsElement;
 
 
 
 public void Click_WindowsAndAlert() {
	 alert_WindowsElement.click();
 }
 
 
 public void click_Alet() {
	 
	 alert.click();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 public void alert1() {
	 alert1.click();
	 alertAccept();
	 getScreenShoot(xLpath, configpath);
	 
 } public void alert2() 
 {	 alert2.click();
	 try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		System.out.println("Exception occured in Alert3");
		e.printStackTrace();
	}
	 alertAccept();
 }
	 
  public void alert3() throws InterruptedException {
	 alert3.click();
	 Thread.sleep(1000);
	 alertAccept();
	 Assert.assertEquals(afterAlertMessagElement.getText(),"You pressed OK!" );
	 String message=afterAlertMessagElement.getText();
	 System.out.println(message);
	 alert3.click();
	 alertDismiss();
	 Assert.assertEquals(afterAlertMessagElement.getText(),"You pressed Cancel!" );
	 String m=afterAlertMessagElement.getText();
	 System.out.println(m);
 }  public void alert4() {
	 alert4.click();
	 alertSendkeys("Hi I am putting value in alert");
	 alertAccept();
	 
 }
  
   
}