package com.selenium.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;


public class ExtentReport {
	
	public static ExtentReports report;
	
	public static ExtentReports getReportInstance() {
		if(report== null) {
			
			String reportName = timeInstance.getname();
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Report\\"+reportName+".html");
			report = new ExtentReports(); 
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Browser", "Chrome");
			
			
			htmlReporter.config().setDocumentTitle("Main project");
			htmlReporter.config().setReportName("Themes and Epic Module");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTimeStampFormat("dd MMM, yyyy  HH:mm:ss");
		}
		
		
		
		
		return report;
		
		
		
	}
	

}
