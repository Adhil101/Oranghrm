package sortingAutomation;

import org.openqa.selenium.By;

public class uploadtest extends Homepage {
	static objectPage ob = new objectPage(driver);
	
	static void Uploadtest() {
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.xpath("/html/body/form/div[2]/div[21]/div/input")).sendKeys("/Users/syedadhil/Testspace/images/whitebike Small.png");
		
	}

}
