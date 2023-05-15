// TASK : In this code we will perform following sibling method


package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_08_SiblingChild_lec45_46 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		////header/div/button[1]/following-sibling::button[1]
		String sr = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(sr);
		
		String sr1 = driver.findElement(By.xpath("//header/div/button[1]/parent :: div/parent::header/div/button[1]")).getText();
		System.out.println(sr1);
	}

}
