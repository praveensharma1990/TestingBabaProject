package TestingBaba_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Button_Page extends BaseLibrary {
	
		public Button_Page() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target='#elements']")
    private WebElement element;
	@FindBy(xpath = "//a[@class=\"nav-link\"and text()=\"buttons\"]")
	private WebElement buttonsElement;

	@FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
	private WebElement dubleclickElement;
	@FindBy(xpath = "//p[@id=\"double-content\"]")
	private WebElement textAfterDouble;
	@FindBy(xpath = "//button[@id=\"noContextMenu\"]")
	private WebElement rightClick;
	@FindBy(xpath = "//p[@id=\"right-content\"]")
	private WebElement textAfterRightClick;
	@FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
	private WebElement singleclick;
	@FindBy(xpath = "//p[@id=\"click-content\"]")
	private WebElement textAfterSingleClick;
	
	public void element_Click() {
		element.click();
	}
	public void buttons_Click() {
		buttonsElement.click();
	}
	
   public void doubleClick() throws InterruptedException
   {
	   doubleClick(dubleclickElement);
	   Thread.sleep(1000);
	   Assert.assertEquals(getReadData("doubleClick"), textAfterDouble.getText());
	   System.out.println("Message is same as expected for double click");
	   
   } public void rightClick() {
	   
	   rightClick(rightClick);
	   Assert.assertEquals(getReadData("writeClick"), textAfterRightClick.getText());
	   System.out.println("Message is same as expected for right click");
   }
   
   public void singleClick() {
	   singleClick(singleclick);
	   Assert.assertEquals(getReadData("singleClick"), textAfterSingleClick.getText());
	   System.out.println("Message is same as expected for single click");
   } 
   public void getReaddatafromPropfile() {
	   System.out.println("I am in GetReadData function");
	  // System.out.println(getReadData("writeClick"));
   }
  
}
