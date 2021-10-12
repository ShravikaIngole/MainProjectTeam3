package com.selenium.mainSpring;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.getUtil;
import com.selenium.utilities.readProperty;

public class epic_module extends DriverSetup {

   public static void epicValidation() throws IOException, InterruptedException {

		

		WebElement openEpic = driver.findElement(By.xpath(readProperty.getProperty("open_epic_Xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", openEpic);
		
		Thread.sleep(6000);
		
	}
	
   public static void createEpic() throws IOException, InterruptedException{
		
		String mainEpicWindow = driver.getWindowHandle();
		driver.switchTo().frame("eform_seg_1255259");
	
		System.out.println("New Window" +mainEpicWindow);
		
		WebElement addEpic = driver.findElement(By.id(readProperty.getProperty("addEpic_Id")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", addEpic);
		Thread.sleep(5000);
		//addEpic.click();
		
		String createEpicWindow = driver.getWindowHandle();
		System.out.println("New Window" +createEpicWindow);
		
		
		System.out.println("Current Window"+driver.getWindowHandle());
		
		

		
//		WebElement cardOwner = driver.findElement(By.id(readProperty.getProperty("cardOwner_Id")));
//		cardOwner.click();
//		Thread.sleep(2000)	
//		WebElement;
//		WebElement cardOwnerName = driver.findElement(By.xpath(readProperty.getProperty("cardOwnerName_Xpath")));
//		cardOwnerName.click();
		
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Handles :" +windows);
		Iterator<String> Handle = windows.iterator();
		String exitEpic = Handle.next();
		String createEpic = Handle.next();
		
		driver.switchTo().window(createEpic);
		WebElement rank = driver.findElement(By.id(readProperty.getProperty("rank_Id")));
		rank.click();
		rank.clear();
		rank.sendKeys(readProperty.getProperty("rank_Value"));
		
		WebElement dueDate = driver.findElement(By.id("CM_DUEDATE"));
		dueDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cal_CM_DUEDATE\"]")).click();
		Thread.sleep(2000);
		WebElement dueDate1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a"));
		dueDate1.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'_Text_Check_CM_Name\']")).sendKeys("epicuser103");
		WebElement save = driver.findElement(By.id("saveBtn"));
		save.click();
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(getUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.switchTo().window(exitEpic);

		driver.manage().timeouts().pageLoadTimeout(getUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.switchTo().frame("contentframe");
	
		
		
		
		
		
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
