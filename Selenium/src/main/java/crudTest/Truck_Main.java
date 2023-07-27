package crudTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truck_Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozank\\Desktop\\chromedriver_win32\\chromedriver.exe");
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

		//Clicking login button
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[2]/form/div[5]/button")).submit();
		
		//Trucks Testing
		Truck_CrudTest truckTest = new Truck_CrudTest();
		
		waitFunc(3);
		
		truckTest.AddingTruck(driver);
		
		waitFunc(3);
		
		truckTest.UpdateTruck(driver);
		
		waitFunc(3);
		
		truckTest.DeletingTruck(driver);
		
		waitFunc(3);
		
		truckTest.searchTruck(driver);
	}
	

	public static void waitFunc(int duration) {
		try {
			Thread.sleep(duration * 1000);
		} catch (InterruptedException e) {
			System.out.println("Exception thread");
			
			e.printStackTrace();
		}
	}
}
