package demo_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_errormassage_lec34_35 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//To synchronize, we have to wait(implicitly)after every step to give that step time to be completed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//  Launch Website
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		//Click on the username text box and send value  
		driver.findElement(By.id("inputUsername")).sendKeys("Samiran");
		
		//Click on the password text box and send value
		driver.findElement(By.name("inputPassword")).sendKeys("samiran123");
		
		//Click the Submit Button
		driver.findElement(By.className("signInBtn")).click();
		
		//Check the error massage and print it
		String text = driver.findElement(By.cssSelector("p.error")).getText(); // syntax of cssSelector for classname is [ tagname.classname ]
		System.out.println("The errror massage : "+text);
		
		
		
	}

}