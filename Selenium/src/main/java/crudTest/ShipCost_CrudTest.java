package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShipCost_CrudTest {
	public void addCost(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-money-bill-wave")).click();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div[1]/div[2]")).click();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.name("transportationCostId")).sendKeys("Intern12345");
		driver.findElement(By.name("price")).sendKeys("500");
		driver.findElement(By.name("originLocationId")).sendKeys("TR");
		driver.findElement(By.name("destinationLocationId")).sendKeys("6CM370");
		driver.findElement(By.name("extraStopCost")).sendKeys("750");
		driver.findElement(By.name("extraMacroStopCost")).sendKeys("600");
		driver.findElement(By.name("extraMicroStopCost")).sendKeys("350");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		
		waitfunc.waitFunc(3);
	}
	
	public void updateCost(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-money-bill-wave")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"transportation-cost\"]/div[2]/table/tbody/tr[9]/td[13]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[1]")).click();
		
		updateCostInfo("transportationCostId", "Updated Intern", driver);
		updateCostInfo("price", "300", driver);
		updateCostInfo("originLocationId", "USA", driver);
		updateCostInfo("destinationLocationId", "0MC736", driver);
		updateCostInfo("extraStopCost", "650", driver);
		updateCostInfo("extraMacroStopCost", "500", driver);
		updateCostInfo("extraMicroStopCost", "700", driver);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
	}
	
	public void updateCostInfo(String clName, String input, WebDriver driver) {
		WebElement clName1 = driver.findElement(By.name(clName));
		Actions a = new Actions(driver);
		a.moveToElement(clName1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		clName1.sendKeys(input);
	}

	public void deleteCost(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.className("fa-money-bill-wave")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"transportation-cost\"]/div[2]/table/tbody/tr[9]/td[13]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"optiyol-modal-add-address\"]/div[2]/button")).click();
	}
}
