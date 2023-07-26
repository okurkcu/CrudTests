package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozank\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.optiyol.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ozan.kurkcu@optiyol.com");
		driver.findElement(By.id("password")).sendKeys("2023opto");
		driver.findElement(By.id("cursor-pointer sign-in-up-btn btn color-p d-block w-40 mt-6")).click();
	}

}
