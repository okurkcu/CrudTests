package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Regions_CrudTest {
	public void addRegion(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-city")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[1]/div[2]")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.name("regionCode")).sendKeys("AnkaraTest01");
		driver.findElement(By.name("regionLabel")).sendKeys("AnkaraTest01-Tunalı");
		driver.findElement(By.name("city")).sendKeys("Ankara");
		driver.findElement(By.name("county")).sendKeys("Çankaya");
		driver.findElement(By.name("maximumVolume")).sendKeys("100");
		driver.findElement(By.name("maximumWeight")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"add-vehicle-step1\"]/div[4]/div/div[2]/div[1]/div/div/div/div/input[2]")).sendKeys("0900");
		driver.findElement(By.xpath("//*[@id=\"add-vehicle-step1\"]/div[4]/div/div[2]/div[2]/div/div/div/div/input[2]")).sendKeys("1800");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		
		waitfunc.waitFunc(3);
	}

	public void updateRegion(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-city")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"order_tracking\"]/div[2]/table/tbody/tr[1]/td[24]/div/i")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[1]")).click();
		waitfunc.waitFunc(3);
		
		updateRegionInfo("regionCode", "AnkaraTestUpdate", driver);
		updateRegionInfo("regionLabel", "AnkaraTest-Update", driver);
		updateRegionInfo("city", "UpdateAnkara", driver);
		updateRegionInfo("county", "Küçükesat", driver);
		updateRegionInfo("maximumVolume", "50", driver);
		updateRegionInfo("maximumWeight", "50", driver);
	}
	
	public void updateRegionInfo(String clName, String input, WebDriver driver) {
		WebElement clName1 = driver.findElement(By.name(clName));
		Actions a = new Actions(driver);
		a.moveToElement(clName1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		clName1.sendKeys(input);
	}

	public void deleteRegion(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-city")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"order_tracking\"]/div[2]/table/tbody/tr[1]/td[24]/div/i")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"optiyol-modal-add-address\"]/div[2]/button")).click();
		waitfunc.waitFunc(3);
	}
}
