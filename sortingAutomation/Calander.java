package sortingAutomation;

import org.openqa.selenium.By;

public class Calander extends Homepage {
static objectPage ob = new objectPage(driver);
static void calander() {
	
	ClickOnElement(ob.getinstance().getDatepicker());

	for(int i=1;i<40;i++) {
		ClickOnElement(ob.getinstance().getnext());
		String year = ob.getinstance().getyear().getText();
		if(year .equals("2024")) {	
			String month = ob.getinstance().getmonth().getText();
			if(month.equals("September")) {
				ClickOnElement(ob.getinstance().driver.findElement(By.linkText("10")));

				break;
			}

		}
	}
}
	
}
