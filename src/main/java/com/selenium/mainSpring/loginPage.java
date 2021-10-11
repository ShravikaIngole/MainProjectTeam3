package com.selenium.mainSpring;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.utilities.readProperty;

public class loginPage extends DriverSetup {
	
	public static void userLogin() throws IOException, InterruptedException {
		
		WebElement email = driver.findElement(By.id(readProperty.getProperty("email_Id")));
		email.click();
		email.sendKeys(readProperty.getProperty("user_emailId"));
		
		WebElement nextBtn = driver.findElement(By.id(readProperty.getProperty("nextBtn_Id")));
		nextBtn.click();
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id(readProperty.getProperty("password_Id")));
		password.click();
		password.sendKeys(readProperty.getProperty("user_Password"));
		
		WebElement signInBtn = driver.findElement(By.id(readProperty.getProperty("signInBtn_Id")));
		signInBtn.click();
		
		
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("Enter OTP to login :"); String OTP = scanner.next();
//		  Thread.sleep(7000); WebElement otp =
//		  driver.findElement(By.id(readProperty.getProperty("otp_Id"))); otp.click();
//		  otp.sendKeys(OTP);
//		 
//		
//		WebElement verifyBtn = driver.findElement(By.id(readProperty.getProperty("verifyBtn_Id")));
//		verifyBtn.click();
//		
//		WebElement yesBtn = driver.findElement(By.id(readProperty.getProperty("yesBtn_Id")));
//		yesBtn.click();
		Thread.sleep(10000);
		System.out.println("Login Successful");
		
		Thread.sleep(3000);
	}
}
