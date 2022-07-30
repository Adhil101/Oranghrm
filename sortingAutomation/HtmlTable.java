package sortingAutomation;

import org.openqa.selenium.By;

public class HtmlTable extends Homepage {
static objectPage ob = new objectPage(driver);

static void Htmltable() {
	
	int row = driver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
	int column = driver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/th")).size();
	
	System.out.println("Number of rows:"+row);
	
	System.out.println("Number of column:"+column);
	
	System.out.println("   ");
	
	for(int i = 1; i<=column; i++) {
		
		System.out.print(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th["+i+"]")).getText()+ "    ");

	}
	
	System.out.println();
	
	for (int i=2; i<=row; i++) {
		
		for (int j =1; j<= column; j++) {
			
			System.out.print(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText()+ "    ");
		}
		System.out.println();
	}

	}

}
