// TASK : In this code , we are going to handle Auto Suggetive Drop Down List



package demo_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12_AutoSuggestiveDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ind");
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				
				option.click();
				break;
				
			}
			
			
		}
		
		Thread.sleep(5000);
		
		String sr = driver.findElement(By.cssSelector("input[id='autosuggest']")).getAttribute("value");
		System.out.println(sr);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
