package com.selenium.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.mainSpring.ActivityLog_module;
import com.selenium.mainSpring.Attachments_module;
import com.selenium.mainSpring.comments_module;
import com.selenium.mainSpring.epic_module;
import com.selenium.mainSpring.homePage;
import com.selenium.mainSpring.loginPage;
import com.selenium.mainSpring.themes_module;

public class testRun {
	
	public static WebDriver driver;
	@BeforeSuite
	public void openBrowser() throws IOException, InterruptedException {
		
		driver = DriverSetup.getWebDriver();
		//DriverSetup.openURL(driver);
		
	}
	
	@Test (priority = 0)
	public void loginpageTest() throws IOException, InterruptedException {
		
		loginPage.userLogin();
		
		homePage.modules();
	}
	
	@Test (priority = 1)
	public void themePageTest() throws IOException, InterruptedException {
		
		themes_module.themesValidation();
		themes_module.createTheme();
		//themes_module.ownerName();
		//themes_module.rank();
		themes_module.dueDate();
		themes_module.name();
		//themes_module.description();
		themes_module.priority();
		//themes_module.size();
		//themes_module.finishDate();
		themes_module.saveButton();
		
		themes_module.blockComment();
		themes_module.unblockComment();
		//themes_module.returnButton();
		
		//themes_module.epicChecking();
	}
	
	@Test (priority = 2)
	public void epicPageTest() throws IOException, InterruptedException {
		epic_module.epicValidation();
		//epic_module.createEpic();
		
	}
	
	@Test (priority = 3)
	public void commentPageTest() throws IOException, InterruptedException{
		
		comments_module.commentsValidation();
//		comments_module.createComments();
//		comments_module.replyComments();
//		comments_module.hideReply();
	}
	
	@Test (priority = 4)
	public void attachmentPageTest() throws IOException, InterruptedException{
		Attachments_module.attachmentsValidation();
	
	}
	
	@Test (priority = 5)
	public void activityLogPageTest() throws IOException, InterruptedException{
		ActivityLog_module.activityLogValidation();
		ActivityLog_module.returnButton();
	
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		DriverSetup.closeDriver();
		
	}

}
