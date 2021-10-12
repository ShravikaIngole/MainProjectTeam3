package com.selenium.mainSpring;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.getUtil;
import com.selenium.utilities.readProperty;

public class comments_module extends DriverSetup  {
	
public static void commentsValidation() throws IOException, InterruptedException {
	
				
			
		WebElement openComments = driver.findElement(By.xpath(readProperty.getProperty("comments_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openComments);
		driver.manage().timeouts().pageLoadTimeout(getUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		

		System.out.println("Comment is open done");
		
		
		
	}

//   public static void createComments() throws IOException, InterruptedException{
//	   
//	   
//	   
//	    WebElement giveComment = driver.findElement(By.xpath(readProperty.getProperty("comment_textarea_Xpath")));
//		giveComment.click();
//		Thread.sleep(1000);
//		giveComment.sendKeys(readProperty.getProperty("comment_description"));
//		Thread.sleep(1000);
//		
//		
//		WebElement addComment = driver.findElement(By.xpath(readProperty.getProperty("addComment_Xpath")));
//		addComment.click();
//		Thread.sleep(1000);
//		System.out.println("Comments are given");
//	      
//   }
//   
//   public static void replyComments() throws IOException, InterruptedException{
//	   
//	    WebElement replyComment = driver.findElement(By.xpath(readProperty.getProperty("reply_comment_Xpath")));
//		replyComment.click();
//		Thread.sleep(1000);
//		replyComment.sendKeys(readProperty.getProperty("comment_description1"));
//		Thread.sleep(1000);
//		
//		WebElement addComment = driver.findElement(By.xpath(readProperty.getProperty("addComment_Xpath")));
//		addComment.click();
//		Thread.sleep(1000);
//		System.out.println("Reply is given on comment");
//   }
//   
//   public static void hideReply() throws IOException, InterruptedException{
//	   
//	    WebElement hideReply = driver.findElement(By.xpath(readProperty.getProperty("hide_reply_Xpath")));
//	    hideReply.click();
//		Thread.sleep(1000);
//		
//		System.out.println("Hide comment");
//   }
//   
//   
   

}
