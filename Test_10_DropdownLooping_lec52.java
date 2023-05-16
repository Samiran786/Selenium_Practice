package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_10_DropdownLooping_lec52 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		
		String sr = driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		System.out.println(sr);
		
		for(int i=0; i<=3; i++) {
			
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
			
		}
		
		String sr1 = driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		System.out.println(sr1);
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		
	}

}
