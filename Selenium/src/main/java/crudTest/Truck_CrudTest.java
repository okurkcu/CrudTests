package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Truck_CrudTest {

	public void AddingTruck(WebDriver driver) {

		//Trucks page
		WebElement trucks = driver.findElement(By.className("fa-truck-moving"));
		trucks.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);
		
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

	public void DeletingTruck(WebDriver driver) {

		//Trucks page
		WebElement trucks = driver.findElement(By.className("fa-truck-moving"));
		trucks.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);
		
		driver.findElement(By.className("more-action-ellipsis")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"optiyol-modal-delete-route\"]/div[1]/div[3]/div[2]")).click();
	}

	public void UpdateTruck(WebDriver driver) {

		//Trucks page
		WebElement trucks = driver.findElement(By.className("fa-truck-moving"));
		trucks.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);

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

	public void searchTruck(WebDriver driver) {
		
		//Trucks page
		WebElement trucks = driver.findElement(By.className("fa-truck-moving"));
		trucks.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/input")).sendKeys("DenemeMulti");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[3]/i")).click();
	}

}
