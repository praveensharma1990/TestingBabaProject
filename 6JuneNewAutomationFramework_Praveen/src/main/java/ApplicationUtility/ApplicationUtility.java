package ApplicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public void doubleClick(WebElement element);
	public void rightClick(WebElement element);
	public void singleClick(WebElement element);
	public void switchWindows(int tabNo);
	public void UploadFile(String path);
	public void alertAccept();
	public void alertDismiss();
	public void alertSendkeys(String Value);
	public void selectbyValue(WebElement element, String value);
	public void selectbyText(WebElement element, String value);
	public void selectbyIndex(WebElement element, int index_no);
	public void mousehover(WebElement element);
	public void mousehoverClick(WebElement element,String LinkText);
	public String GetTooltip(WebElement element,String atributeName);
	public String getDate(String dateFormate);
	public String getDate_Time(String formate);
		
	}

