// TASK : We gonna perform assertion by testng in this Code


package demo_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_06_Assertion_lec40_41 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		String name = "Samiran";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(2000);
		
		// Different type of locator used in this line. 
		//text() has been used 
		String sr = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		System.out.println(sr);
		
		String sr1 = driver.findElement(By.cssSelector("div[class='login-container'] h2 ")).getText();
		System.out.println(sr1);
		
		// Assertions are here from this line.
		Assert.assertEquals(sr,"You are successfully logged in.");
		Assert.assertEquals(sr1, "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();
	}

}
