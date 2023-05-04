// TASK : We will try regular exoression of xpath and CSS selector in this Code



package demo_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_05_RegularExpression_lec39 {
	public static void main(String[] args) throws InterruptedException {
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
		
		// Lets wait for 1 sec so that the sliding process of the website is completed
		Thread.sleep(1000);  
		
		// Click the new username block and enter the value
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Samiran");
		
		// Click on the Email block with Css selector and enter some value
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Samiran123@gmail.com");
		
		// Click on the Email block with CUSTOMIZED XPATH and clear the previous value
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		// Click on the Email block with Customized CSS SELECTOR and enter some value
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Tiasha123@capgemini.com");
		
		//Click on the phone number block with PArent child Xpath and enter the value
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9531658094");
		
		//Click on the "Reset Login" button with CSS Selector
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		// get the text of reset password generated from the page by PArent child CSS selector
		String rpd = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println("The recoverd password : "+rpd );
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// The task of this Code starts from here ----------->
		
		
		// Click on the "Go To Login" button with the help of parent child xpath
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		// Lets wait for 1 sec so that the sliding process of the website is completed
		Thread.sleep(1000);
		
		// Click the UserName box and put the value by css Selector
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		// Click the Password box and put the value by regular expression css selector
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		// Click the check box by id
		driver.findElement(By.id("chkboxOne")).click();
		
		// Click the "Sign in" button by regular expression xpath
		driver.findElement(By.xpath("//button[contains (@class, 'submit')]")).click();
		
		
	}

}
