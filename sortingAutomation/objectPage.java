package sortingAutomation;

import org.openqa.selenium.WebDriver;

public class objectPage extends Homepage{
	
	public  WebDriver driver;
	
	private pathPage pp;
	
	public objectPage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public pathPage getinstance() {
		if(pp == null) {
			pp = new pathPage(driver);
		}
		
		return pp;
	}

}
