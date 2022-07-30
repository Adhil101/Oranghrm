package sortingAutomation;

import org.openqa.selenium.By;

public class Frames extends Homepage{
	public static objectPage ob = new objectPage(driver);
	static void frames() {
		driver.switchTo().frame("frame-one1434677811");
		
		
		if(ob.getinstance().getFristname().isEnabled() && 
		   ob.getinstance().getLastname().isEnabled()&&
		   ob.getinstance().getCountary().isEnabled()&&
		   ob.getinstance().getCity().isEnabled()&& 
		   ob.getinstance().getEmailaddress().isEnabled()&&
		   ob.getinstance().getPhone().isEnabled()) 
		
		{
			
			sendkey(ob.getinstance().getFristname(), "Mark");
			sendkey(ob.getinstance().getLastname(), "Specter");
			sendkey(ob.getinstance().getPhone(),"7829301288");
			sendkey(ob.getinstance().getCountary(), "USA");
			sendkey(ob.getinstance().getCity(),"El paso");
			sendkey(ob.getinstance().getEmailaddress(),"Markspecter@hotmail.com");
			
			
			
		}
		else {
			System.out.println("Firstname and Lastname is not enabled");
		}
			
		if (ob.getinstance().getGender().isEnabled()&&
			ob.getinstance().getMonday().isEnabled()&&
			ob.getinstance().getTuesday().isEnabled()&&
			ob.getinstance().getThursday().isEnabled()&&
			ob.getinstance().getWednesday().isEnabled()&&
			ob.getinstance().getTimetocontact().isEnabled())
		{
			ClickOnElement(ob.getinstance().getGender());
			ClickOnElement(ob.getinstance().getMonday());
			ClickOnElement(ob.getinstance().getTuesday());
			ClickOnElement(ob.getinstance().getThursday());
			ClickOnElement(ob.getinstance().getWednesday());
			
			selectByVisibletest(ob.getinstance().getTimetocontact(), "Afternoon");
			ClickOnElement(ob.getinstance().getSubmit());
			
		}
	        
		   driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//input[@id='age']")).sendKeys("27");

	}
	

}
