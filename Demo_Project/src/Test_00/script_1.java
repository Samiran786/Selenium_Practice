package Test_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_1 {
	  
	  
	 
	  
	    public static void main(String[] args) {  
	        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	     driver.navigate().to("https://www.amazon.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");  
	          
	    // Click on the search button  
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();  
	      
	    }  
	  
	} 


