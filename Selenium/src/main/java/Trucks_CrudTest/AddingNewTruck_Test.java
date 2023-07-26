package Trucks_CrudTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingNewTruck_Test {

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
		
		//Adding new truck
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/div[2]/div[1]")).click();
		
		//Necessary information
		driver.findElement(By.name("vehicleId")).sendKeys("Arac12Dev");
		driver.findElement(By.name("plateNumber")).sendKeys("Arac12Dev");
		driver.findElement(By.name("startLocationId")).sendKeys("DepoAnkara");
		driver.findElement(By.name("endLocationId")).sendKeys("DepoAnkara");
		driver.findElement(By.name("volumeCapacity")).sendKeys("100");
		driver.findElement(By.name("weightCapacity")).sendKeys("100000");
		driver.findElement(By.name("boxCapacity")).sendKeys("1000");
		driver.findElement(By.name("palletCapacity")).sendKeys("100");
		driver.findElement(By.name("size5Capacity")).sendKeys("0");
		driver.findElement(By.name("size6Capacity")).sendKeys("0");
		
		driver.findElement(By.name("fixedUsageCost")).sendKeys("500");
		driver.findElement(By.name("costPerKm")).sendKeys("1");
		
		driver.findElement(By.name("driverNameSurname")).sendKeys("Ozan Kürkçü");
		driver.findElement(By.name("driverId")).sendKeys("33");
		driver.findElement(By.name("driverPhone")).sendKeys("05073642328");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();

	}

}
