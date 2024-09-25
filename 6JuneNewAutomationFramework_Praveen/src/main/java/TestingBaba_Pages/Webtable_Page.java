package TestingBaba_Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import baselibrary.BaseLibrary;

public class Webtable_Page extends BaseLibrary {

    public Webtable_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#elements']")
    private WebElement element;

    @FindBy(xpath = "//a[text()='web tables']")
    private WebElement webtable;

    @FindBy(xpath = "//*[@id='tab_4']/div/iframe")
    private WebElement iframe;

    @FindBy(xpath = "//*[text()='Name:']/following::input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//*[text()='Email:']/following::input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//*[text()='Save']")
    private WebElement save;

    @FindBy(xpath = "//*[@class='table table-bordered data-table']/thead/following::tbody/tr/td[1]")
    private List<WebElement> nameForVarification;

    @FindBy(xpath = "//*[@class='table table-bordered data-table']/thead/following::tbody/tr/td[2]")
    private List<WebElement> emailForVarification;

    @FindBy(xpath = "//*[@class='btn btn-info btn-xs btn-edit']")
    private List<WebElement> editButtonElements;

    @FindBy(xpath = "//*[@class='btn btn-info btn-xs btn-update']")
    private WebElement updateButtonElements;

    @FindBy(xpath = "//*[@name=\"edit_name\"]")
    private WebElement editname;

    @FindBy(xpath = "//*[@name=\"edit_email\"]")
    private WebElement editemail;

    public void element_click() {
        element.click();
    }

    public void webtable_click() {
        webtable.click();
    }

    public void fillDetails() {
        driver.switchTo().frame(iframe);
        for (int i = 1; i <= 7; i++) {
            name.sendKeys(getReadData(xLpath, 3, i, 0));
            email.sendKeys(getReadData(xLpath, 3, i, 1));
            save.click();
        }
        
    }

    public void nameVarification() {
        SoftAssert sf = new SoftAssert();
        int j = 1;
        for (int i = 0; i < nameForVarification.size(); i++) {
            sf.assertEquals(nameForVarification.get(i).getText(), getReadData(xLpath, 3, j, 0));
            System.out.println(nameForVarification.get(i).getText());
            j++;
        }
        System.out.println("All Names matched");
        sf.assertAll();
    }

    public void emailVarification() {
        SoftAssert sf = new SoftAssert();
        int j = 1;
        for (int i = 0; i < emailForVarification.size(); i++) {
            sf.assertEquals(emailForVarification.get(i).getText(), getReadData(xLpath, 3, j, 1));
            j++;
        }
        System.out.println("All Emails matched");
        sf.assertAll();
    }

    public void updatedName() {
        
        for (int i = 0; i < editButtonElements.size(); i++) {
        	editButtonElements.get(i).click();
        	editname.clear();
            editname.sendKeys(getReadData(xLpath, 3, i + 1, 2));
            updateButtonElements.click();
        }
        
    }

    public void updateEmail() {
        
        for (int i = 0; i < editButtonElements.size(); i++) {
        	editButtonElements.get(i).click();
        	editemail.clear();        	
            editemail.sendKeys(getReadData(xLpath, 3, i + 1, 3));
            updateButtonElements.click();
        }
        
    }  public void namevalidationAfterUpdatetion() {
    	for(int i=0;i<nameForVarification.size();i++) {
    		Assert.assertEquals(getReadData(xLpath, 3, i+1, 2), nameForVarification.get(i).getText());
    		
    		
    	}System.out.println("Name After updation are mathced ");
    } public void emailValidationAfterUpdation() {
    	for(int i=0;i<emailForVarification.size();i++) {
    		Assert.assertEquals(getReadData(xLpath, 3, i+1, 3), emailForVarification.get(i).getText());
    	
    } System.out.println("Emails After updation are mathced ");
    }
}
