package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class Attachments_module extends DriverSetup {
	
public static void attachmentsValidation() throws IOException, InterruptedException {
	
		
		WebElement openAttachment = driver.findElement(By.xpath(readProperty.getProperty("attachment_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openAttachment);
		Thread.sleep(2000);
		System.out.println("Attachment open done");
		
		
		}
	
	
	
	

}
