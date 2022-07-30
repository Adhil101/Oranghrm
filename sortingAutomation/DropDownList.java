package sortingAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class DropDownList extends Homepage{
	
	public static objectPage ob = new objectPage(driver);
	static List orgList = new ArrayList();
	static List temList = new ArrayList();
   
	static void DropDownlist(WebElement Listelement, String listname){
	
	
	List <WebElement> options = Select(Listelement);
    int optioncount = options.size();
    
    System.out.println((listname)+ "dropdown size is "+ optioncount);
		
	
	orgList = getlist(options);
	
	temList = getlist(options);
	
	System.out.println("orginal list"+orgList);
	

	Collections.sort(temList);
	
	System.out.println("sorted list"+temList);
	
	if(orgList.equals(temList))
	{
		System.out.println("Dropdown list is sorted");
	}
	else 
	{
		System.out.println("Dropdown list is not sorted");
	}
 
	System.out.println();
}
	
	static void DropDownlist2() {
		selectByVisibletest(ob.getinstance().getspeeddropdown(), "Fast");
		selectByvalue(ob.getinstance().getfilesdropdown(), "2");
		selectByVisibletest(ob.getinstance().getnumberdropdown(), "4");
		selectByvalue(ob.getinstance().getProductdropdown(), "Apple");
		selectByvalue(ob.getinstance().getanimaldropdown(), "babycat");
		
	}
	
}

