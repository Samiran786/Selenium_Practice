// TASK : In this code we will get dynamic password from website 


package demo_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_07_DynamicPassword_lec42 {
	
	public String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("div[class='forgot-pwd-btn-conainer'] :nth-child(2)")).click();
		String info = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		
		String[] password = info.split("'");
		String[] password1 = password[1].split("'");
		
		return password1[0];
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Test_07_DynamicPassword_lec42 cl = new Test_07_DynamicPassword_lec42();
		
		String pwd = cl.getPassword(driver);
		
		
		String name = "Samiran";
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id= 'inputUsername']")).sendKeys(name);
		driver.findElement(By.cssSelector("form[class='form'] :nth-child(3)")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
