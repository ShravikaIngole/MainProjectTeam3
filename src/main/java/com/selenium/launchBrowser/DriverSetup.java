package com.selenium.launchBrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.selenium.utilities.getUtil;
import com.selenium.utilities.readProperty;

public class DriverSetup {
	
	public static WebDriver driver;
	public static String browserValue;
	
	public static WebDriver getWebDriver() throws IOException, InterruptedException {
		
		//browserValue = readProperty.getProperty("Browser");
		browserValue = "Chrome";
		
		if(browserValue == "Chrome"){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver94.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("enable-automation");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-extensions");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-gpu");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		else if(browserValue == "Firefox") {
			
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver 2");
			//FirefoxOptions fo = new FirefoxOptions();
			//driver = new FirefoxDriver(fo);
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(getUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();//to maximize window
		driver.get(readProperty.getProperty("login_url")); //go to https://pratesting.cognizant.com
		Thread.sleep(3000);
		return driver;
	}
	
	public static WebDriver openURL(WebDriver driver) throws IOException {
		
		driver.manage().window().maximize();//to maximize window
		driver.get(readProperty.getProperty("url")); //go to https://pratesting.cognizant.com
		
		return driver;
	}

	public static void closeDriver() {
		
		driver.quit();
		
	}

}
