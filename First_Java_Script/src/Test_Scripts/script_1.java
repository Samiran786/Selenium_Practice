
package Test_Scripts;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 


public class script_1 {
	
	  
	 
	  
	    public static void main(String[] args) {  
	        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\Selenium Files\\Chrome_driver\\chromedriver_win32");  
	    WebDriver driver=new ChromeDriver();  
	      
	    // Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
	          
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click();  
	      
	    }  
	  
}  


