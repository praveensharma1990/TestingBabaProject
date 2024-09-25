package TestingBaba_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class LinksPage extends BaseLibrary {
	
	
	public LinksPage() {
		
		PageFactory.initElements(driver,this);
	}
	  @FindBy(xpath = "//button[@data-target='#elements']")
      private WebElement element;	
	  @FindBy(xpath = "//a[normalize-space()='links']")
	  private WebElement linkForClick;
	  @FindBy(xpath = "//a[normalize-space()='Demo Page']")
	  private WebElement demopageLink;
	  
	  
	  public void elementclick() {
		  
		  element.click();
	  }
	  
	  public void linkClick() {
		  linkForClick.click();
	  }
	  
	  public void demopageLinkclick() {
		  demopageLink.click();
		  driver.get("https://google.com");
		  driver.get("https://lbb.in");
	  }
	  
	  @Override
	public void switchWindows(int tabNo) {
		
		super.switchWindows(tabNo);
	}

}
