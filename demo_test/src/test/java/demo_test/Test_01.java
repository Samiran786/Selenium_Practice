package demo_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_01 {
	
	public static void main(String[] args) {
		
		 // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	     driver.navigate().to("https://www.amazon.in/");  
	          
	    // Click on the search text box and send value  
	    //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");  
	          
	    // Click on the search button  
	    //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  
	      WebElement dropdown = driver.findElement(By.id("icp-nav-flyout"));
	      Actions actions = new Actions(driver);
	      
	      actions.moveToElement(dropdown).perform();
	      
	      WebElement options = driver.findElement(By.xpath("//span[text()='বাংলা']"));
	      actions.moveToElement(options).click();
		
	}

}
