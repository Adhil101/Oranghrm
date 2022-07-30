package sortingAutomation;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sortTest extends Homepage {

	public static WebDriver driver = getBrowser("chrome");
	public static objectPage ob = new objectPage(driver);	
	
	public static Logger log = LogManager.getLogger();

	public static void main(String[] args) throws InterruptedException, IOException {

		implicitlywait(driver);

	   log.info("lunching thr url");
     	getUrl("https://testautomationpractice.blogspot.com/");
     
		Frames.frames();

		log.info("invoking Dropdownlis");
		DropDownList.DropDownlist(ob.getinstance().getProductdropdown(),"Product");
//			
		DropDownList.DropDownlist(ob.getinstance().getspeeddropdown(),"Speed");
//			
		DropDownList.DropDownlist(ob.getinstance().getnumberdropdown(),"Number");
//		
		DropDownList.DropDownlist(ob.getinstance().getfilesdropdown(),"File");
//		
		DropDownList.DropDownlist(ob.getinstance().getanimaldropdown(),"Animal");
//		
		DropDownList.DropDownlist2();
//
		Search.search();
//
		Switchwindow.switchwindow();
//		
		Alertwindow.alert();
//		
		Calander.calander(); 

		HtmlTable.Htmltable(); 
     	
     	mouseaction.MoucseAction();		
     	
     	//Linktest.linktest();
     	
//     	uploadtest.Uploadtest();
     	
     	
     	//quit(driver);

		

		

	}

}
