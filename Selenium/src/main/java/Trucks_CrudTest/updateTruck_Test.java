package Trucks_CrudTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class updateTruck_Test {

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
		System.out.println(System.currentTimeMillis());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception thread");
			
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis());
		
		String link = driver.getCurrentUrl();
		
		System.out.println(link);
		
		//Trucks page
		WebElement trucks = driver.findElement(By.className("fa-truck-moving"));
		trucks.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception thread");
			
			e.printStackTrace();
		}

		driver.findElement(By.className("more-action-ellipsis")).click();
		driver.findElement(By.className("fa-pen")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception thread");
			
			e.printStackTrace();
		}
		
		updateTruckInfo("plateNumber", "Updated-Truck", driver);
		updateTruckInfo("startLocationId", "Tunalı", driver);
		updateTruckInfo("endLocationId", "ODTU Teknokent", driver);
		updateTruckInfo("volumeCapacity", "50", driver);
		updateTruckInfo("weightCapacity", "50000", driver);
		updateTruckInfo("boxCapacity", "500", driver);
		updateTruckInfo("palletCapacity", "50", driver);
		updateTruckInfo("fixedUsageCost", "1000", driver);
		updateTruckInfo("costPerKm", "0,50", driver);
		updateTruckInfo("driverNameSurname", "Updated Name", driver);
		updateTruckInfo("driverId", "Updated ID", driver);
		updateTruckInfo("driverPhone", "Updated Phone", driver);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
	}

	public static void updateTruckInfo(String clName, String input, WebDriver driver) {
		
		WebElement clName1 = driver.findElement(By.name(clName));
		Actions a = new Actions(driver);
		a.moveToElement(clName1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		clName1.sendKeys(input);
	}
}
