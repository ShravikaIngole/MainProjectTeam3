package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class ActivityLog_module extends DriverSetup {
	
	public static void activityLogValidation() throws IOException, InterruptedException {
	
	WebElement openActivityLog = driver.findElement(By.xpath(readProperty.getProperty("activityLog_Xpath")));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", openActivityLog);
	Thread.sleep(2000);
	System.out.println("Activity Log open done");
	}
	
	
	public static void returnButton() throws IOException, InterruptedException {
		
//		WebElement returnBtn = driver.findElement(By.id(readProperty.getProperty("returnBtn_Id")));
//		returnBtn.click();
//		Thread.sleep(2000);
		
		
		WebElement returnBtn = driver.findElement(By.id(readProperty.getProperty("returnBtn_Id")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", returnBtn);
		Thread.sleep(8000);
		
		
	}
}
