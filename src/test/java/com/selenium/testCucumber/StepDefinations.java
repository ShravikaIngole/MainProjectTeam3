package com.selenium.testCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.selenium.launchBrowser.DriverSetup;
import com.selenium.mainSpring.homePage;
import com.selenium.mainSpring.loginPage;
import com.selenium.mainSpring.themes_module;

public class StepDefinations {
	
	@Given("open the pratesting webpage")
	public void open_the_pratesting_webpage() throws Throwable {
		
		DriverSetup.getWebDriver();
		loginPage.userLogin();
		homePage.modules();
	}


	
	@When("user navigates Theme module")
	public void user_navigates_Theme_module() throws Throwable {
		themes_module.themesValidation();
		themes_module.createTheme();
		themes_module.ownerName();
		
	}

	@When("user fills form from using rowvalue {int} and colvalue {int}")
	public void user_fills_form_from_using_rowvalue_and_colvalue(Integer arg1, Integer arg2) throws Throwable {
//		Object[][] retrivedData= test.getData();
//		CreateTheme.clickOnAddTheme();
//		CreateTheme.fillName(retrivedData[arg1][arg2].toString());
//		CreateTheme.fillDescription(retrivedData[arg1][arg2+1].toString());
//		CreateTheme.fillPriority(retrivedData[arg1][arg2+2].toString());
//		CreateTheme.dueDate(retrivedData[arg1][arg2+3].toString());
	}

	@Then("user clicks the save button and verifying details are saved")
	public void user_clicks_the_save_button_and_verifying_details_are_saved() throws Throwable {
//		CreateTheme.clickSave();
	}

}
