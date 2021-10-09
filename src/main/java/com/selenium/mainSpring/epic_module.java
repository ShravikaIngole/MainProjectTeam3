package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class epic_module extends DriverSetup {

   public static void epicValidation() throws IOException, InterruptedException {
//	  	Thread.sleep(3000);
//		WebElement execute = driver.findElement(By.xpath(readProperty.getProperty("execute_Xpath")));
//		execute.click();
//		System.out.println("execute in epic");
//		
//		WebElement theme = driver.findElement(By.id(readProperty.getProperty("themes_Id")));
//		theme.click();
//		Thread.sleep(3000);
		
	   //driver.switchTo().frame("contentframe");
//		WebElement search = driver.findElement(By.xpath("//*[@id='searchTextBox-inputWrap']"));
//		search.click();
//		search.sendKeys(readProperty.getProperty("theme_item"));
//		Thread.sleep(3000);
//		
//		WebElement searchclick = driver.findElement(By.xpath(readProperty.getProperty("search_buttton")));
//		searchclick.click();
//		Thread.sleep(3000);
//
//		
//		WebElement openTheme = driver.findElement(By.xpath(readProperty.getProperty("select_theme_Xpath")));
//		openTheme.click();
//		//((Select) opentheme).selectByVisibleText("THM2287");
//		Thread.sleep(3000);
		
//		WebElement openEpic = driver.findElement(By.name(readProperty.getProperty("open_epic_Xpath")));
//		openEpic.click();
//		Thread.sleep(3000);
		
		//driver.switchTo().frame("contentframe");
		

		WebElement openEpic = driver.findElement(By.xpath(readProperty.getProperty("open_epic_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openEpic);
		Thread.sleep(6000);
		
	}
	
	
	public static void createEpic() throws IOException, InterruptedException{
		
		WebElement addEpic = driver.findElement(By.id(readProperty.getProperty("addEpic_Id")));
		addEpic.click();
		
		driver.switchTo().frame("contentframe");
		
		WebElement cardOwner = driver.findElement(By.id(readProperty.getProperty("cardOwner_Id")));
		cardOwner.click();
		Thread.sleep(2000);
		WebElement cardOwnerName = driver.findElement(By.xpath(readProperty.getProperty("cardOwnerName_Xpath")));
		cardOwnerName.click();
		
		Thread.sleep(2000);
		WebElement rank = driver.findElement(By.id(readProperty.getProperty("rank_Id")));
		rank.click();
		rank.clear();
		rank.sendKeys(readProperty.getProperty("rank_Value"));
		
		
		
		
	}
	
	
}
