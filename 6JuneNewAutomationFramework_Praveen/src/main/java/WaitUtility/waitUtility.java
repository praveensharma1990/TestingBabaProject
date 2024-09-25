package WaitUtility;

import org.openqa.selenium.WebElement;

public interface waitUtility {
	public void visiblityOfElement(WebElement element,int time);
	public void elementIsClickable(WebElement element,int time);
	public void alertIsPresent(int time);

}
