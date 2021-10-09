package com.selenium.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.selenium.launchBrowser.DriverSetup;
import com.selenium.mainSpring.ActivityLog_module;
import com.selenium.mainSpring.Attachments_module;
import com.selenium.mainSpring.comments_module;
import com.selenium.mainSpring.epic_module;
import com.selenium.mainSpring.homePage;
import com.selenium.mainSpring.loginPage;
import com.selenium.mainSpring.themes_module;
import com.selenium.utilities.ExtentReport;

public class testRun {
	
	ExtentReports report= ExtentReport.getReportInstance();
	
	
	public static WebDriver driver;
	@BeforeSuite
	public void openBrowser() throws IOException, InterruptedException {
		
		driver = DriverSetup.getWebDriver();
		//DriverSetup.openURL(driver);
		
	}
		
	@Test (priority = 0)
	public void loginpageTest() throws IOException, InterruptedException {
		
		ExtentTest logger = report.createTest("1 Validating LoginPage", "Test 1");
		logger.log(Status.INFO, "Test for Login Page");
		loginPage.userLogin();
		logger.pass("Passed");
		
		
		ExtentTest logger1 = report.createTest("2 Validating HomePage", "Test 2");
		logger1.log(Status.INFO, "Test for Home Page");
		homePage.modules();
		logger1.pass("Passed");
	}
	
	@Test (priority = 1)
	public void themePageTest() throws Exception {
		
		//Test to create a theme page
		ExtentTest logger = report.createTest("3 Validating Theme Page", "Test 3");
		logger.log(Status.INFO, "Test for Theme Page");
		themes_module.themesValidation();
		logger.pass("Passed");
		
		
		//Test to create Theme
		ExtentTest logger1 = report.createTest("4 Validating to create Theme ", "Test 4 ");
		logger1.log(Status.INFO, "Test for creating a theme");
		themes_module.createTheme();
		themes_module.ownerName();
		logger1.log(Status.INFO, "Owner Name is given ");
		themes_module.name();
		logger1.log(Status.INFO, "Name is given ");
		themes_module.rank();
		logger1.log(Status.INFO, "Rank is set ");
		themes_module.dueDate();
		logger1.log(Status.INFO, "Due Date is set ");
		
		themes_module.description();
		logger1.log(Status.INFO, "Description is given ");
		themes_module.priority();
		logger1.log(Status.INFO, "Priority is set ");
		themes_module.size();
		logger1.log(Status.INFO, "Size is given ");
		themes_module.finishDate();
		logger1.log(Status.INFO, "Finish Date is set ");
		themes_module.saveButton();
		logger1.log(Status.INFO, "New Theme is created ");
		logger1.pass("Passed");
		
		
		//Test to block the theme
		ExtentTest logger2 = report.createTest("5 Validating the block button in theme", "Test 5");
		logger2.log(Status.INFO, "Test for blocking the theme ");
		themes_module.blockComment();
		logger2.log(Status.INFO, "Theme is blocked");
		logger2.pass("Passed");
		
		
		
		
		//Test to unblock the theme
		ExtentTest logger3 = report.createTest("6 Validating the unblock button in theme", "Test 6");
		logger3.log(Status.INFO, "Test for unblocking the theme ");
		themes_module.unblockComment();
		logger3.log(Status.INFO, "Theme is unblocked");
		logger3.pass("Passed");
		
		
		//themes_module.returnButton();
		
	
	}
	
	@Test (priority = 2)
	public void epicPageTest() throws IOException, InterruptedException {
		
		//Test for Epic Page
		ExtentTest logger = report.createTest("7 Validating the Epic Page", "Test 7");
		logger.log(Status.INFO, "Test for Epic page");
		epic_module.epicValidation();
		logger.log(Status.INFO, "Epic page is displayed");
		logger.pass("Passed");
		
		
		
		
	}
	
	@Test (priority = 3)
	public void commentPageTest() throws IOException, InterruptedException{
		
		ExtentTest logger = report.createTest("8 Validating the Comment Page", "Test 8");
		logger.log(Status.INFO, "Test for Comment Page ");
		comments_module.commentsValidation();
		logger.log(Status.INFO, "Comment page is displayed");
		logger.pass("Passed");
		
		
		
//		comments_module.createComments();
//		comments_module.replyComments();
//		comments_module.hideReply();
	}
	
	@Test (priority = 4)
	public void attachmentPageTest() throws IOException, InterruptedException{
		
		//Test for Attachment Page
		ExtentTest logger = report.createTest("9 Validating Attachment Page", "Test 9");
		logger.log(Status.INFO, "Test for Attachment Page");
		Attachments_module.attachmentsValidation();
		logger.log(Status.INFO, "Attachment page is displayed");
		logger.pass("Passed");
		
		
	
	}
	
	@Test (priority = 5)
	public void activityLogPageTest() throws IOException, InterruptedException{
		
		//Test for Activity Log
		ExtentTest logger = report.createTest("10 Validating Activity Log page", "Test 10");
		logger.log(Status.INFO, "Test for Activity Log Page ");
		ActivityLog_module.activityLogValidation();
		logger.log(Status.INFO, "Activity Log page is displayed");
		logger.pass("Passed");
		
		
		
		//Test for returning the Home page
		ExtentTest logger1 = report.createTest("11 Validating the theme page Return option ", "Test 11");
		logger1.log(Status.INFO, "Test for Returning to Home Page ");
		ActivityLog_module.returnButton();
		logger.log(Status.INFO, "Home page is displayed");
		logger1.pass("Passed");
		
	
	}
	
	@AfterSuite
	public void closeBrowser() {
		report.flush();
		DriverSetup.closeDriver();
		
	}

}
