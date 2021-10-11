package com.selenium.mainSpring;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.ExcelData;
import com.selenium.utilities.readProperty;

public class themes_module extends DriverSetup{

	public static void themesValidation() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		WebElement execute = driver.findElement(By.id(readProperty.getProperty("execute_Id")));
		execute.click();
		
		WebElement theme = driver.findElement(By.id(readProperty.getProperty("themes_Id")));
		theme.click();
	}
	
	public static void createTheme() throws IOException, InterruptedException {
		
		WebElement addTheme = driver.findElement(By.id(readProperty.getProperty("addTheme_Id")));
		addTheme.click();
		
		driver.switchTo().frame("contentframe");
	}
	
	public static void ownerName() throws IOException, InterruptedException {
		
		WebElement owner = driver.findElement(By.id(readProperty.getProperty("owner_Id")));
		owner.click();
		Thread.sleep(2000);
		WebElement ownerName = driver.findElement(By.xpath(readProperty.getProperty("name_Xpath")));
		ownerName.click();
		Thread.sleep(2000);
	}
	
	public static void rank() throws Exception {
		
		WebElement rank = driver.findElement(By.id(readProperty.getProperty("rank_Id")));
		rank.click();
		rank.clear();
		//rank.sendKeys(readProperty.getProperty("rank_Value"));
		driver.findElement(By.xpath(readProperty.getProperty("rank_Id"))).sendKeys(ExcelData.readData(1, 1));
		Thread.sleep(2000);
	}
	
	public static void dueDate() throws IOException, InterruptedException {
		
		WebElement dueDate = driver.findElement(By.id(readProperty.getProperty("dueDate_Id")));
		dueDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(readProperty.getProperty("dueDate_Xpath"))).click();
		Thread.sleep(2000);
	}
	
	public static void name() throws Exception {
		
		WebElement name = driver.findElement(By.id(readProperty.getProperty("name_Id")));
		name.click();
		//name.sendKeys(readProperty.getProperty("name_Value"));
		driver.findElement(By.id(readProperty.getProperty("name_Id"))).sendKeys(ExcelData.readData(1, 0));
		Thread.sleep(2000);
	}
	
	public static void description() throws Exception {
		
		WebElement description = driver.findElement(By.xpath(readProperty.getProperty("description_Xpath")));
		description.click();
		//description.sendKeys(readProperty.getProperty("description_Value"));
		driver.findElement(By.xpath(readProperty.getProperty("description_Xpath"))).sendKeys(ExcelData.readData(1, 2));
	}
	
	public static void priority() throws IOException, InterruptedException {
		
		Select priority = new Select(driver.findElement(By.xpath(readProperty.getProperty("priority_Xpath"))));
		Thread.sleep(2000);
		priority.selectByVisibleText("Medium");
	}
		
		
	public static void size() throws IOException, InterruptedException {
		
		Select size = new Select(driver.findElement(By.xpath(readProperty.getProperty("size_Xpath"))));
		Thread.sleep(2000);
		size.selectByVisibleText("L");
		Thread.sleep(2000);
	}
		
	public static void finishDate() throws IOException, InterruptedException {
		
		WebElement plannedFinish = driver.findElement(By.id(readProperty.getProperty("plannedFinish_Id")));
		plannedFinish.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(readProperty.getProperty("plannedFinishDate_Xpath"))).click();
	}
	
	public static void saveButton() throws IOException, InterruptedException {
		
		WebElement saveBtn = driver.findElement(By.xpath(readProperty.getProperty("saveBtn_Xpath")));
		saveBtn.click();
		Thread.sleep(2000);
	}
		
		
		
		//to block
	public static void blockComment() throws Exception {
		
		//driver.switchTo().frame("contentframe");
//		WebElement themeId = driver.findElement(By.xpath(readProperty.getProperty("themeID_Xpath")));
//		themeId.click();
		Thread.sleep(2000);
		WebElement blockBtn = driver.findElement(By.id(readProperty.getProperty("blockBtn_Id")));
		blockBtn.click();
		Thread.sleep(2000);
		WebElement blockReason = driver.findElement(By.xpath(readProperty.getProperty("blockReason_Xpath")));
		blockReason.click();
		Thread.sleep(2000);
		WebElement selectReason = driver.findElement(By.xpath(readProperty.getProperty("selectReason_Xpath")));
		selectReason.click();
		Thread.sleep(2000);
		WebElement blockingComment = driver.findElement(By.xpath(readProperty.getProperty("blockingComment_Xpath")));
		blockingComment.click();
		//blockingComment.sendKeys(readProperty.getProperty("blockingComment_Value"));
		driver.findElement(By.xpath(readProperty.getProperty("blockingComment_Xpath"))).sendKeys(ExcelData.readData(1, 3));
		WebElement saveBlockBtn = driver.findElement(By.xpath(readProperty.getProperty("saveBlockBtn_Xpath")));
		saveBlockBtn.click();
		Thread.sleep(3000);
	}
		
		//to unblock
	public static void unblockComment() throws Exception {
		
		WebElement unblockBtn = driver.findElement(By.xpath(readProperty.getProperty("unblockBtn_Xpath")));
		unblockBtn.click();
		Thread.sleep(2000);
		WebElement unblockingComment = driver.findElement(By.xpath(readProperty.getProperty("unblockingComment_Xpath")));
		unblockingComment.click();
	//	unblockingComment.sendKeys(readProperty.getProperty("unblockingComment_Value"));
		driver.findElement(By.xpath(readProperty.getProperty("unblockingComment_Xpath"))).sendKeys(ExcelData.readData(1, 4));
		Thread.sleep(2000);
		WebElement saveunblockBtn = driver.findElement(By.xpath(readProperty.getProperty("saveunblockBtn_Xpath")));
		saveunblockBtn.click();
		Thread.sleep(2000);
	}

       

	
	
}

