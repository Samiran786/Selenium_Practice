package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_00_username {
	public static void main(String[] args) {
		
		 // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	     driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");  
	          
	    // Click on the username text box and send value  
	     driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	    
	    // Click on the password text box and send value  
	     driver.findElement(By.name("inputPassword")).sendKeys("Rahul123");
	     
	    // Click on the sign in button  
	     driver.findElement(By.className("signInBtn")).click();
	    
	      
		
	}

}
