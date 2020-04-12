package com.sprintqa.stepDef;

import java.util.List;

import com.sprintqa.pages.DataTableValidationPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTableValidationStep extends BaseClass {

	DataTableValidationPage dtValidation = new DataTableValidationPage(getWebDriver());

	@Given("^user opens demo website$")
	public void user_opens_demo_website() throws Throwable {
		dtValidation.openDemoWeb();
	}

	@Then("^verify table data in website$")
	public void verify_table_data_in_website(DataTable data) throws Throwable {
		List<List<String>> dataList = data.asLists(String.class);
		dtValidation.retriveData(dataList);
	}

}
