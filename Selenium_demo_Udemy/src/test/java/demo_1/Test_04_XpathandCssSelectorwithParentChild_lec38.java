// TASK : in this Code, we gonna perform Parent child relation of Xpath and Css Selector

package demo_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_04_XpathandCssSelectorwithParentChild_lec38 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To synchronize, we have to wait(implicitly)after every step to give that step time to be completed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    //Launch Website
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		//Click on the username text box and send value
		driver.findElement(By.id("inputUsername")).sendKeys("Samiran");
		
		//Click on the password text box and send value
		driver.findElement(By.name("inputPassword")).sendKeys("samiran123");
		
		//Click the Submit Button
		driver.findElement(By.className("signInBtn")).click();
		
		//Check the error massage and print it
		String text  = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("The error massage : "+text);
		
		// Get the LinkText "Forgot your password?" from the page
		String ltext = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		
		// Click on the LinkText "Forgot your password?"
		driver.findElement(By.linkText(ltext)).click();
		
		// Click the new username block and enter the value
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Samiran");
		
		// Click on the Email block with Css selector and enter some value
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Samiran123@gmail.com");
		
		// Click on the Email block with CUSTOMIZED XPATH and clear the previous value
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		// Click on the Email block with Customized CSS SELECTOR and enter some value
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Tiasha123@capgemini.com");
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// The task of this Code starts from here ----------->
		
		//Click on the phone number block with PArent child Xpath and enter the value
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9531658094");
		
		//Click on the "Reset Login" button with className
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		// get the text of reset password generated from the page by PArent child CSS selector
		String rpd = driver.findElement(By.cssSelector("form p.infoMsg")).getText();
		System.out.println("The recoverd password : "+rpd );
		
		
	}


}
