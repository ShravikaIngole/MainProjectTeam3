package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class Attachments_module extends DriverSetup {
	
public static void attachmentsValidation() throws IOException, InterruptedException {
	
//		Thread.sleep(3000);
//		WebElement execute = driver.findElement(By.id(readProperty.getProperty("execute_Id")));
//		execute.click();
//		System.out.println("Execute click");
//		
//		WebElement theme = driver.findElement(By.id(readProperty.getProperty("themes_Id")));
//		theme.click();
//		Thread.sleep(3000);
//		System.out.println("Theme Click");
//		
//
//		WebElement search = driver.findElement(By.xpath(readProperty.getProperty("searchBox_Xpath")));
//		search.click();
//		search.sendKeys(readProperty.getProperty("theme_item"));
//		Thread.sleep(3000);
//		System.out.println("Theme item search done");
//		
//		
//		WebElement searchclick = driver.findElement(By.xpath(readProperty.getProperty("search_buttton")));
//		searchclick.click();
//		Thread.sleep(3000);
//		System.out.println("Click on search icon done");
//		
//	
//		WebElement openTheme = driver.findElement(By.xpath(readProperty.getProperty("select_theme_Xpath")));
//		openTheme.click();
//		Thread.sleep(3000);
//		System.out.println("Theme open done");
//		
//		driver.switchTo().frame("contentframe");
		
		//WebElement openComments = driver.findElement(By.xpath(readProperty.getProperty("comments_Xpath")));
//		WebElement openComments = driver.findElement(By.xpath(readProperty.getProperty("attachment_Xpath")));
//		openComments.click();
//		Thread.sleep(3000);
		
		
		
		
		WebElement openAttachment = driver.findElement(By.xpath(readProperty.getProperty("attachment_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openAttachment);
		Thread.sleep(2000);
		System.out.println("Attachment open done");
		
		
		//driver.switchTo().frame("contentframe");
		
//		WebElement addAttachment = driver.findElement(By.xpath(readProperty.getProperty("add_attachment_Xpath")));
//		WebElement addAttachment = driver.findElement(By.id(readProperty.getProperty("add_attachment_Id")));
//		addAttachment.click();
//		Thread.sleep(3000);
//		System.out.println("Attachment add done");
		





}
	
	
	
	

}
