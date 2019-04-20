package SITS;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlentext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hussam\\Documents\\chromedriver.exe");
		
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("http://www.facebook.com");
	    
	    driver.findElementByXPath("//input[@id='u_0_c']").sendKeys("bakumba");
        driver.findElementByXPath("//input[@id='u_0_e']").sendKeys("al3jeeb");
        driver.findElementByXPath("//input[@id='u_0_h']").sendKeys("seh13@hotmail.com");
        driver.findElementByXPath("//input[@id='u_0_k']").sendKeys("seh13@hotmail.com");
        driver.findElementByXPath("//input[@id='u_0_o']").sendKeys("Theoneandonly2019");
        driver.findElementByXPath("//select[@id='month']").isSelected();
        driver.findElementByXPath("//input[@id='u_0_a']").click();
        driver.findElementByLinkText("Forgot account?").click();
        
        
	}

}
