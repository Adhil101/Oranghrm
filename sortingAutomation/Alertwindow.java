package sortingAutomation;

public class Alertwindow extends Homepage {
	
	static objectPage ob = new objectPage(driver);
	
	static void alert() throws InterruptedException {
		
		ClickOnElement(ob.getinstance().getClickme());

		Thread.sleep(4000);
		String AlertMessage = driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		
		String pressok = "You pressed OK!";
		String presscancle = "You pressed Cancel!";
		
		driver.switchTo().alert().accept();
		if(pressok.equals(ob.getinstance().getalertmessage().getText()))
		{
			System.out.println("pressing ok on alert window is passed");
		}
		else
		{
			System.out.println("pressing ok on alert window is failed");
		}
		ClickOnElement(ob.getinstance().getClickme());
		
		driver.switchTo().alert().dismiss();
		
		if(presscancle.equals(ob.getinstance().getalertmessage().getText()))
		{
			System.out.println("pressing cancle on alert window is passed");
		}
		else
		{
			System.out.println("pressing cancle on alert window is failed");
		}
		
		System.out.println("   ");
	}

}
