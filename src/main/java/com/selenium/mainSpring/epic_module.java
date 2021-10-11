package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class epic_module extends DriverSetup {

   public static void epicValidation() throws IOException, InterruptedException {

		

		WebElement openEpic = driver.findElement(By.xpath(readProperty.getProperty("open_epic_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openEpic);
		Thread.sleep(6000);
		
	}
	
	
//	public static void createEpic() throws IOException, InterruptedException{
//		
//		WebElement addEpic = driver.findElement(By.id(readProperty.getProperty("addEpic_Id")));
//		addEpic.click();
//		
//		driver.switchTo().frame("contentframe");
//		
//		WebElement cardOwner = driver.findElement(By.id(readProperty.getProperty("cardOwner_Id")));
//		cardOwner.click();
//		Thread.sleep(2000);
//		WebElement cardOwnerName = driver.findElement(By.xpath(readProperty.getProperty("cardOwnerName_Xpath")));
//		cardOwnerName.click();
//		
//		Thread.sleep(2000);
//		WebElement rank = driver.findElement(By.id(readProperty.getProperty("rank_Id")));
//		rank.click();
//		rank.clear();
//		rank.sendKeys(readProperty.getProperty("rank_Value"));
//		
//		
//		
//		
//	}
	
	
}
