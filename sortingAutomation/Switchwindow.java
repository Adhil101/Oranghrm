package sortingAutomation;

import java.util.Set;

public class Switchwindow extends Homepage {
	static 	String Title1;
	static   String Title2;

	objectPage ob = new objectPage(driver);
	static void switchwindow() {

		Set<String> s = driver.getWindowHandles();
		String Mainwindow = driver.getWindowHandle();

		for (String i:s) {
			for(String j:s) {
				String t = driver.switchTo().window(j).getTitle();
				Title1=t;
			}

			String t = driver.switchTo().window(i).getTitle();
			if(!Title1.equals(t)) {
				Title2 = t;
			}



		}
		System.out.println("The Title one is "+Title1);
		System.out.println("The Title two is "+Title2);
		System.out.println();


		driver.switchTo().window(Mainwindow);
	}
}
