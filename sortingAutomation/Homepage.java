package sortingAutomation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	public static WebDriver driver;
	// driver invoke
	
	public static WebDriver getBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void ClickOnElement(WebElement element1) {
		element1.click();
	}
	
	public static void selectByvalue(WebElement element1, String value) {
		Select se = new Select(element1);
		
		se.selectByValue(value);
		
	
		
		}
	public static void selectByVisibletest(WebElement element1, String value) {
		Select se = new Select(element1);
		
		se.selectByVisibleText(value);
	
		}
	
	public static void selectByindex(WebElement element1, int index) {
		Select se = new Select(element1);
		se.selectByIndex(index);
		
		
		}
	
	public static void sendkeys(WebElement element, Keys keys) {
		
		element.sendKeys(keys);
		
	}
	
    public static void sendkey(WebElement element, String value) {
		
		element.sendKeys(value);
		
	}
	
	
	public static List<WebElement> Select(WebElement element) {
		Select se = new Select(element);
		
		return se.getOptions();
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
	
	public static String gettext(WebElement element) {
		return element.getText();
	}
	
	public static List<WebElement> getlist(List<WebElement> element) {
		
		List text = new ArrayList();
		
		for(WebElement data : element) {
			 text.add(data.getText());
			
			
		}
		return text;
		
		
	}
	
	public static void implicitlywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	
	
}
