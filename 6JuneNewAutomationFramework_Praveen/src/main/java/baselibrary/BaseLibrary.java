package baselibrary;
import java.awt.Desktop.Action;
import java.awt.Event;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.pivottable.ExtendedPivotTableViewFieldsRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.microsoft.schemas.office.office.DetectmouseclickAttribute;

import ApplicationUtility.ApplicationUtility;
import ExcelUtility.excelUtility;
import PropertyUtility.propertyUtility;
import ScreeshotUtility.ScreenshootUtility;
import WaitUtility.waitUtility;



public class BaseLibrary implements excelUtility,propertyUtility,ApplicationUtility,ScreenshootUtility,waitUtility  {
    static public WebDriver driver;
    public String configpath="C:\\Users\\LENOVO\\eclipse-workspace\\6JuneNewAutomationFramework_Praveen\\testdata\\config.properties";
    public String xLpath="C:\\Users\\LENOVO\\eclipse-workspace\\6JuneNewAutomationFramework_Praveen\\testdata\\empdata.xlsx"; 
    public void getLaunchUrl(String websiteUrl) throws InterruptedException
    {  
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\LENOVO\\eclipse-workspace\\6JuneNewAutomationFramework_Praveen\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(websiteUrl);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='×']")).click();
        driver.findElement(By.xpath("//*[text()='Practice']")).click();
    }
    
    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Override
    public String getReadData(String path, int sheetNo, int rowNum, int columnNo) {
        String value = "";
        try
        { FileInputStream fStream=new FileInputStream(path);
          XSSFWorkbook workbook=new XSSFWorkbook(fStream);
          XSSFSheet sheet=workbook.getSheetAt(sheetNo);
         value= sheet.getRow(rowNum).getCell(columnNo).getStringCellValue();
               
        	
        	
        }catch (Exception e) {
			System.out.println(e.getMessage());
		} return value;
                }

	@Override
	public String getReadData(String key) {
		String value="";
		try 
		{ FileInputStream fStream=new FileInputStream(configpath);
		     Properties prop=new Properties();
		     prop.load(fStream);
			value= prop.getProperty(key);
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}

	@Override
	public void doubleClick(WebElement element) {
		Actions action= new Actions(driver);
		action.doubleClick(element).perform();
		
	}

	@Override
	public void rightClick(WebElement element) {
	  Actions actions=new Actions(driver);
	  actions.contextClick(element).perform();
		
	}

	@Override
	public void singleClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.click(element).perform();
				
	}

	@Override
	public void switchWindows(int tabNo) {
	 Set<String> windowshandleSet=driver.getWindowHandles();
	 List<String>tabsList=new ArrayList<String>(windowshandleSet);
	 driver.switchTo().window(tabsList.get(tabNo));
		
	}

	@Override
	public void UploadFile(String path) {
	try { StringSelection slSelection =new StringSelection(path);
	      Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
	      clipboard.setContents(slSelection, null);
	      Robot robot =new Robot();
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.delay(5000);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      
		
	} catch (Exception e) {
		System.out.println("Issue in file upload");
	}
		
	}

	@Override
	public void alertAccept() {
	 driver.switchTo().alert().accept();
		
	}

	@Override
	public void alertDismiss() {
	 driver.switchTo().alert().dismiss();
		
	}

	@Override
	public void alertSendkeys(String Value)
	{
	  driver.switchTo().alert().sendKeys(Value);
		
	}
	@Override
	public void getScreenShoot(String folderName,String FileName)
	{	try {
		
		String loc = System.getProperty("user.dir");
		String path=loc+"//screenshots//"+folderName+"//"+FileName+".png";
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	
	
	} catch (Exception e) {
		// TODO: handle exception
	}
}

@AfterMethod
public void getResultAnalysis(ITestResult result)
{
	String name = result.getMethod().getMethodName();
	try {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			getScreenShoot("passed", name);
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			getScreenShoot("failed", name);
		}
		else
		{
			getScreenShoot("skip", name);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
       

	
	@Override
	public void selectbyValue(WebElement element, String value) {
	  Select select=new Select(element);
      select.selectByValue(value);			  
		
	}

	@Override
	public void selectbyText(WebElement element, String value) {
		Select select=new Select(element);
			      select.selectByVisibleText(value);			  
					
	}

	@Override
	public void selectbyIndex(WebElement element, int index_no) {
		Select select=new Select(element);
			      select.selectByIndex(index_no);			  
					
		
	}

	@Override
	public void mousehover(WebElement element) {
	   Actions actions=new Actions(driver);
	   actions.moveToElement(element).perform();
		
	}

	@Override
	public void mousehoverClick(WebElement element, String LinkText) {
		 Actions actions=new Actions(driver);
		   actions.moveToElement(element).build().perform();
		   driver.findElement(By.linkText(LinkText)).click();
		    	
		
	}

	@Override
	public String GetTooltip(WebElement element, String atributeName) {
		String value="";
		try{
			value=element.getAttribute(atributeName);
		}catch (Exception e) {
			System.out.println("extception ouccered in tooltip function");
		}
		
		return value;
	}

	@Override
	public String getDate(String Formate) {
		String value="";
	    Date db= new Date ();
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat(Formate);
	    value= simpleDateFormat.format(db);
		return value;
	}

	@Override
	public String getDate_Time(String formate) {
		String value="";
	    Date db=new Date();
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat(formate);
	   value= simpleDateFormat.format(db);
		return value;	
		}

	@Override
	
	public void visiblityOfElement(WebElement element, int time) {
	 WebDriverWait wait=new WebDriverWait(driver, time);
	 wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	@Override
	public void elementIsClickable(WebElement element, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
			
		
	}
	@Override
	public void alertIsPresent(int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		 wait.until(ExpectedConditions.alertIsPresent());
			
		
		
	}	
	
	}