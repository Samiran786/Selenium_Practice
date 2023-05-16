// TASK : In this code, we will perform the handling of the check boxes


package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_13_Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMIBANE\\OneDrive - Capgemini\\Desktop\\New_Selenium_File\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// SubTask : Clicking a particular check box
		WebElement checkbox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		
		if(checkbox.isSelected()==false) {
			
			Thread.sleep(5000);
			checkbox.click();
			
		}
		else {
			System.out.println("Checkbox is already checked");
		}
		
		// Subtask : Checking the number or size of the check boxes in the website
		int num = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("The number of checkboxes in the website : "+num);
	}
	

}
