package TestingBaba_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DatePicker_page extends BaseLibrary {
	
	public DatePicker_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[normalize-space()='Widgets']")
	private WebElement widgets;
	@FindBy(xpath = "//a[normalize-space()='date picker']")
	private WebElement datePicker;
	@FindBy(xpath = "//div[@class='col-md-9 col-sm-12 form-inline']//input[@type='date']")
	private WebElement selectDate;
	
	
	public void clickOn_Widgets_datePicker()
	{
		try
		{
			widgets.click();
			visiblityOfElement(datePicker, 2);
			datePicker.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void select_Date()
	{
		try
		{
			selectDate.click();
			//visiblityOfElement(selectDate, 2);
			selectDate.clear();
			String dateStr = getDate("dd-MM-YYYY");
			System.out.println(dateStr);
			selectDate.sendKeys(dateStr);
			Thread.sleep(10000);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}	


