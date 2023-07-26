package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozank\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.out.println("2");
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
				
		driver.get("https://dev.optiyol.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("ozan.kurkcu@optiyol.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("2023opto");
		
		WebElement loginButton = driver.findElement(By.id("cursor-pointer sign-in-up-btn btn color-p d-block w-40 mt-6"));
		loginButton.click();
		//driver.findElement(By.id("email")).sendKeys("ozan.kurkcu@optiyol.com");
		//driver.findElement(By.id("password")).sendKeys("2023opto");
		//driver.findElement(By.id("cursor-pointer sign-in-up-btn btn color-p d-block w-40 mt-6")).click();
	}
}
