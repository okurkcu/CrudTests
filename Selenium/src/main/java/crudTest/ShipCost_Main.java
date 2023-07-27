package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShipCost_Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozank\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
				
		driver.get("https://dev.optiyol.com/");
		
		//Necessary username and password
		WebElement username = driver.findElement(By.id("email"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("ozan.kurkcu@optiyol.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("2023opto");

		//Clicking login button
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[2]/form/div[5]/button")).submit();
		
		//Shipping Cost Test
		ShipCost_CrudTest cost = new ShipCost_CrudTest();
		
		//Adding new shipping cost
		cost.addCost(driver);
		
		//Updating the shipping cost
		cost.updateCost(driver);
		
		//Deleting the shipping cost
		cost.deleteCost(driver);
	}

}
