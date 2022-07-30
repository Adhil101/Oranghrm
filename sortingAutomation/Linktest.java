package sortingAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Linktest extends Homepage {
	static objectPage ob = new objectPage(driver);
	
	static WebElement Element;
	
	static String Element1;
	
	static List<String> url = new ArrayList<String>() ;
	
	static void linktest() throws InterruptedException, IOException {
		
		
		 
		List<WebElement> anker = driver.findElements(By.tagName("a"));
		
		List<WebElement> Links = driver.findElements(By.tagName("link"));
		
		System.out.println(Links.get(0));
		
		System.out.println("Anker tag link size "+ anker.size());

		System.out.println("Linktag link size "+Links.size());
		
		for (int i=0; i<=Links.size();i++) {
			
			Element = Links.get(i);
			
			Element1 = Element.getAttribute("href");
			
			url.add(Element1);
			
		}
		
		for(int j = 0; j<=anker.size(); j++) {
			
			Element = anker.get(j);
			
			Element1 = Element.getAttribute("href");
			
			
			url.add(Element1);
						
		}
			
			//URL links = new URL(url);
			
			/*HttpURLConnection httpcon = (HttpURLConnection) links.openConnection();
			
			Thread.sleep(6000);
			
			httpcon.connect();*/
			
			//int responscode = httpcon.getResponseCode();
			
			//System.out.println(responscode);
			
			System.out.println(url);
			
		}

	}


