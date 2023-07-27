package crudTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Parameter_CrudTest {
	public void addParam(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/aside/div[3]/ul/div[3]/li[7]/a/i")).click();
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/div[2]")).click();
		waitfunc.waitFunc(3);
		
		//First Page
		driver.findElement(By.name("paramSetName")).sendKeys("Intern Test");
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[2]/div[1]/div/div/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[2]/div[1]/div/div/div[2]/div/div[5]/div[1]/div[6]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[2]/div[2]/div/div/div/div/input[2]")).sendKeys("1234");
		driver.findElement(By.name("defaultServiceTime")).sendKeys("4");
		driver.findElement(By.name("maximumImprovementTimeInSeconds")).sendKeys("700");
		driver.findElement(By.name("maximumImprovementIterations")).sendKeys("5000");
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[9]/div[1]/div/div/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[9]/div[1]/div/div/div[2]/div/div[5]/div[1]/div[5]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[9]/div[2]/div/div/div/div/input[2]")).sendKeys("1212");
		driver.findElement(By.id("add-location-step1")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[10]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[10]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step1\"]/div[3]/div/div[11]/div[1]/input")).click();
		driver.findElement(By.name("sizeViolationOnePercentPenalty")).sendKeys("1000");
		driver.findElement(By.name("baseReturnViolationPenaltyPerMinute")).sendKeys("1");
		driver.findElement(By.name("variableLatenessPenaltyPerMinute")).sendKeys("3");
		driver.findElement(By.name("maxDistanceWithinDeliveryRegionsAverageDistanceMultiplier")).sendKeys("1,1");
		driver.findElement(By.name("maxDistanceWithinDeliveryRegions")).sendKeys("15");
		driver.findElement(By.name("minimumSpeedKmPerHour")).sendKeys("32");
		driver.findElement(By.name("maximumSpeedKmPerHour")).sendKeys("150");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		
		//Second Page
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"add-location-step3\"]/div[2]/div/div[4]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"add-location-step3\"]/div[2]/div/div[4]/div[2]/input")).click();
		driver.findElement(By.name("increasedTWViolationThreshold")).sendKeys("15");
		driver.findElement(By.xpath("//*[@id=\"add-location-step3\"]/div[2]/div/div[6]/div[1]/input")).click();
		driver.findElement(By.name("defaultVehicleBaseLocation")).sendKeys("DepoAnkara");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
	}

	public void deleteParam(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"parameters\"]/div[2]/table/tbody/tr[1]/td[6]/div/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"optiyol-modal-add-address\"]/div[2]/button")).click();
	}

	public void updateParam(WebDriver driver) {
		Order_Main waitfunc = new Order_Main();
		
		waitfunc.waitFunc(3);
		
		driver.findElement(By.xpath("//*[@id=\"parameters\"]/div[2]/table/tbody/tr[1]/td[6]/div/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/a[1]")).click();
		
		waitfunc.waitFunc(3);
		
		//First Page
		updateParamInfo("paramSetName", "Updated Test Intern", driver);
		updateParamInfo("defaultServiceTime", "5", driver);
		updateParamInfo("defaultPickupTime", "4", driver);
		updateParamInfo("speedMultiplier", "2", driver);
		updateParamInfo("serviceTimeMultiplier", "3", driver);
		updateParamInfo("maximumImprovementTimeInSeconds", "500", driver);
		updateParamInfo("maximumImprovementIterations", "2500", driver);
		updateParamInfo("sizeViolationOnePercentPenalty", "500", driver);
		updateParamInfo("baseReturnViolationPenaltyPerMinute", "1,5", driver);
		updateParamInfo("variableLatenessPenaltyPerMinute", "2,5", driver);
		updateParamInfo("maxDistanceWithinDeliveryRegionsAverageDistanceMultiplier", "3,1", driver);
		updateParamInfo("maxDistanceWithinDeliveryRegions", "10", driver);
		updateParamInfo("minimumSpeedKmPerHour", "45", driver);
		updateParamInfo("maximumSpeedKmPerHour", "180", driver);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		
		//Second Page
		updateParamInfo("increasedTWViolationThreshold", "25", driver);
		updateParamInfo("defaultVehicleBaseLocation", "Tunalı", driver);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
	}
	
	public void updateParamInfo(String clName, String input, WebDriver driver) {
		WebElement clName1 = driver.findElement(By.name(clName));
		Actions a = new Actions(driver);
		a.moveToElement(clName1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		clName1.sendKeys(input);
	}
}
