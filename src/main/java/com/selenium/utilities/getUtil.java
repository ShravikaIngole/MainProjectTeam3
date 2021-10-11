package com.selenium.utilities;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getUtil {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 20;
		
		public static WebElement validateAndLocateId(String idLocator) {

			try {
				WebElement locateElement = null;
				locateElement = driver.findElement(By.id(readProperty.getProperty(idLocator)));
				return locateElement;
			} catch (NoSuchElementException e) {
				System.out.println(e);
				return null;
			}

			catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
	
		
	public static Alert switchToAlert() {
			return driver.switchTo().alert();
		}
	
	public static boolean isAlertDisplayed() {
			try 
		    { 
		        getUtil.switchToAlert(); 
		        return true; 
		    }
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }
			
	}


	public static void visibilityOfElementWait(String string) {
		// TODO Auto-generated method stub
		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(readProperty.getProperty(string))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getAlertBoxText() {
		
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return msg;
	}
	
	public static void handleAlert() throws Exception {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	
}
