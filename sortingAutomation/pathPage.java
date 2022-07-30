package sortingAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pathPage extends Homepage{
	
	public WebDriver driver;
	
	public pathPage(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}

	@FindBy(id = "products") private WebElement Productdropdown;

	public WebElement getProductdropdown() {
		return Productdropdown;
	}
	
	@FindBy(linkText = "ThemeRoller") private WebElement Switchwindow;

	public WebElement getSwitchwindow() {
		return Switchwindow;
	}
	
	@FindBy(xpath = "//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']") private WebElement newwindow;

	public WebElement getNewwindow() {
		return newwindow;
	}
	
	@FindBy(xpath = "//*[@id='RESULT_TextField-1']") private WebElement Fristname;

	

	public WebElement getFristname() {
		return Fristname;
	}
	

	@FindBy(xpath = "//*[@id='RESULT_TextField-2']") private WebElement Lastname;

	

	public WebElement getLastname() {
		return Lastname;
	}
	
	@FindBy(id = "RESULT_TextField-3") private WebElement Phone;

	

	public WebElement getPhone() {
		return Phone;
	}
	
	@FindBy(id = "RESULT_TextField-4") private WebElement Countary;

	

	public WebElement getCountary() {
		return Countary;
	}
	
	@FindBy(id = "RESULT_TextField-5") private WebElement City;

	

	public WebElement getCity() {
		return City;
	}
	
	
	@FindBy(id = "RESULT_TextField-6") private WebElement Emailaddress;

	

	public WebElement getEmailaddress() {
		return Emailaddress;
	}
	
     public WebElement getGender() {
		return Gender;
	}
	public WebElement getMonday() {
		return Monday;
	}
	public WebElement getTuesday() {
		return Tuesday;
	}
	public WebElement getWednesday() {
		return Wednesday;
	}
	public WebElement getThursday() {
		return Thursday;
	}

	@FindBy(xpath="//label[contains(text(),'Male')]") private WebElement Gender;
     @FindBy(xpath="//label[contains(text(),'Monday')]") private WebElement Monday;
     @FindBy(xpath="//label[contains(text(),'Tuesday')]") private WebElement Tuesday;
     @FindBy(xpath="//label[contains(text(),'Wednesday')]") private WebElement Wednesday;
     @FindBy(xpath="//label[contains(text(),'Thursday')]") private WebElement Thursday;
     @FindBy(xpath="//select[@class='drop_down']") private WebElement Timetocontact;
     @FindBy(id="FSsubmit")private WebElement submit;

	public WebElement getTimetocontact() {
		return Timetocontact;
	}

	public WebElement getSubmit() {
		return submit;
	}
     
	@FindBy(id = "Wikipedia1_wikipedia-search-input") private WebElement Search; 
	@FindBy(xpath = "//input[@type='submit']") private WebElement Searchbutton;
	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	@FindBy(xpath = "//a[normalize-space()='More »']")private WebElement Link;

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getLink() {
		return Link;
	}
	
	@FindBy(xpath = "//button[@onclick='myFunction()']") private WebElement Clickme;
	
	public WebElement getClickme() {
		return Clickme;
	}
	
	@FindBy(id = "datepicker") private WebElement Datepicker;
	
	public WebElement getDatepicker() {
		return Datepicker;
	}
	
	@FindBy(xpath = "//a[@data-handler='next']") private WebElement next;
	public WebElement getnext() {
		return next;
	}
	@FindBy(xpath = "//span[@class='ui-datepicker-year']") private WebElement year;
	public WebElement getyear() {
		return year;
	}
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']") private WebElement day;
	public WebElement getday() {
		return day;
	}
	
	@FindBy(xpath = "//span[@class='ui-datepicker-month']") private WebElement month;
	public WebElement getmonth() {
		return month;
	}
	@FindBy(id = "speed") private WebElement speeddropdown;
	
	public WebElement getspeeddropdown() {
		return speeddropdown;
	}
	@FindBy(id = "files") private WebElement filesdropdown;
	
	public WebElement getfilesdropdown() {
		return filesdropdown;
	}
	
	@FindBy(id = "number") private WebElement numberdropdown;
	
	public WebElement getnumberdropdown() {
		return numberdropdown;
	}
	
	@FindBy(id = "animals") private WebElement animaldropdown;
	
	public WebElement getanimaldropdown() {
		return animaldropdown;
	}
	
	@FindBy(xpath = "//p[@id='demo']") private WebElement alertmessage;
	
	public WebElement getalertmessage() {
		return alertmessage;
	}
	@FindBy(xpath = "//button[normalize-space()='Copy Text']") private WebElement doubleclick;
	
	public WebElement getdoubleclick() {
		return doubleclick;
	}
	
}
