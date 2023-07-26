package Trucks_CrudTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingTruck_Test {

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
			System.out.println("Exception thread");
			
			e.printStackTrace();
		}
		
		driver.findElement(By.className("more-action-ellipsis")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"optiyol-modal-delete-route\"]/div[1]/div[3]/div[2]")).click();
	}

}
