package sortingAutomation;

public class Search extends Homepage{
	public static objectPage ob = new objectPage(driver);
	static void search() throws InterruptedException{
		
		sendkey(ob.getinstance().getSearch(), "automation");
		
		ClickOnElement(ob.getinstance().getSearchbutton());
		Thread.sleep(4000);

		if(ob.getinstance().getLink().isDisplayed())
		{

			ClickOnElement(ob.getinstance().getLink());
		}
		else {
			System.out.println("link is not displayed");
		}
	}

}
