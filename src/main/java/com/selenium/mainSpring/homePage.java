package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.selenium.utilities.readProperty;
import com.selenium.launchBrowser.DriverSetup;


public class homePage extends DriverSetup {
	
	
	public static void modules() throws IOException, InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement mainMenu = driver.findElement(By.xpath(readProperty.getProperty("mainMenu_Xpath")));
		
		Actions action= new Actions(driver);
		action.moveToElement(mainMenu).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mainMenu).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mainMenu).build().perform();
		
		Thread.sleep(6000);
		
		WebElement CFO_Onsite = driver.findElement(By.xpath(readProperty.getProperty("CFO_Onsite_Xpath")));
		CFO_Onsite.click();
		
		Thread.sleep(5000);
		
		/*
		 * 
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * WebElement mainMenu =
		 * driver.findElement(By.id(readProperty.getProperty("mainMenu_Xpath")));
		 * action.moveToElement(mainMenu).build().perform();
		 * 
		 * WebElement CFO_Onsite =
		 * driver.findElement(By.id(readProperty.getProperty("CFO_Onsite_Xpath")));
		 * 
		 * CFO_Onsite.click();
		 */
		
		System.out.println("Here are the modules....");
	}

}
