package sortingAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction extends Homepage {
	static objectPage ob = new objectPage(driver);
	static Actions act = new Actions(driver);
	static String expectedtext;
	static String actualtext;
	static WebElement dragable;
	static WebElement droppable;

	static void MoucseAction() throws InterruptedException {



		act.doubleClick(ob.getinstance().getdoubleclick()).build().perform();
		
		System.out.println("Double click test passed");


		dragable = driver.findElement(By.xpath("//div[@id='draggable']"));

		droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(dragable, droppable).build().perform();

		expectedtext = "Dropped!";

		actualtext =	gettext(driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")));

		if (expectedtext.equals(actualtext) ) {
			System.out.println("Drag and drop test passed");
		}
		else {
			System.out.println("Drag and drop test failed");
		}

		dragable =  driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
		droppable = driver.findElement(By.xpath("//div[@id='trash']"));

		act.dragAndDrop(dragable, droppable).build().perform();

		dragable =  driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		droppable = driver.findElement(By.xpath("//div[@id='trash']"));

		act.dragAndDrop(dragable, droppable).build().perform();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[1]//a[1]")).click();
		
		dragable =  driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		act.moveToElement(dragable).dragAndDropBy(dragable, 80, 5).build().perform();
		
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Thread.sleep(4000);
		act.moveToElement(resize).dragAndDropBy(resize, 80, 5).build().perform();
		
	

		



	}


}
