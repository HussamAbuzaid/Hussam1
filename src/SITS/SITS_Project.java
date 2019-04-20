package SITS;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SITS_Project {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hussam\\Documents\\chromedriver.exe");
		
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("http://96.241.214.11:82/");
	    driver.manage().window().maximize();
	    driver.findElementById("ctl00_ContentPlaceHolder1_hypNewUsers").click();
	    driver.findElementById("ctl00_ContentPlaceHolder1_txtFirstName").sendKeys("Hussam");
	    driver.findElementById("ctl00_ContentPlaceHolder1_txtLastName").sendKeys("Abuzaid");
	    driver.findElementByXPath("//input[@name='ctl00$ContentPlaceHolder1$txtAddr1']").sendKeys("1234 people st");
	    driver.findElementByXPath("//input[@id='ctl00_ContentPlaceHolder1_txtCity']").sendKeys("Fairfax");
	    
	    Select drpstate= new Select (driver.findElementByClassName("ctl00$ContentPlaceHolder1$ddlState"));
	    drpstate.selectByValue("VA");
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
