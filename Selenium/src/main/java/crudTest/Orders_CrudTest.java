package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Orders_CrudTest {
	
	public void addingOrder (WebDriver driver) {
		WebElement order = driver.findElement(By.className("fa-cube"));
		order.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]")).click();
		
		driver.findElement(By.name("orderId")).sendKeys("123456");
		driver.findElement(By.name("trackerCode")).sendKeys("654321");
		driver.findElement(By.name("toLocationId")).sendKeys("DepoOptiyol");
		driver.findElement(By.name("fromLocationId")).sendKeys("DepoOptiyol");
		driver.findElement(By.name("volume")).sendKeys("10000");
		driver.findElement(By.name("weight")).sendKeys("1000");
		driver.findElement(By.name("box")).sendKeys("100");
		driver.findElement(By.name("pallet")).sendKeys("500");
		driver.findElement(By.name("size5")).sendKeys("3000");
		driver.findElement(By.name("size6")).sendKeys("1500");
		
		driver.findElement(By.className("btn-next")).click();
	}
	
	public void updateOrder (WebDriver driver) {
		WebElement order = driver.findElement(By.className("fa-cube"));
		order.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"ordersContent1\"]/div[2]/table/tbody/tr[1]/td[21]/div/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[2]")).click();
		
		main.waitFunc(3);
		
		updateOrderInfo("trackerCode", "1111111", driver);
		updateOrderInfo("toLocationId", "Tunalı", driver);
		updateOrderInfo("fromLocationId", "ODTÜ Teknokent", driver);
		updateOrderInfo("volume", "5000", driver);
		updateOrderInfo("weight", "500", driver);
		updateOrderInfo("box", "50", driver);
		updateOrderInfo("pallet", "250", driver);
		updateOrderInfo("size5", "1500", driver);
		updateOrderInfo("size6", "750", driver);
		
		driver.findElement(By.className("btn-next")).click();
		driver.findElement(By.className("btn-next")).click();
	}

	public void deleteOrder (WebDriver driver) {
		WebElement order = driver.findElement(By.className("fa-cube"));
		order.click();
		
		Truck_Main main = new Truck_Main();
		main.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"ordersContent1\"]/div[2]/table/tbody/tr[1]/td[21]/div/i")).click();
		driver.findElement(By.className("fa-trash-alt")).click();
		
		driver.findElement(By.className("btn-disable")).click();
	}
	
	public static void updateOrderInfo(String clName, String input, WebDriver driver) {
		WebElement clName1 = driver.findElement(By.name(clName));
		Actions a = new Actions(driver);
		a.moveToElement(clName1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		clName1.sendKeys(input);
	}
}
