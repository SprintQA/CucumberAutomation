package com.sprintqa.stepDef;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class DataTableExampleStep {

	@Then("^step without datatable$")
	public void step_without_datatable() throws Throwable {
		System.out.println("Step without data table");
	}

	@Then("^step with single datatables$")
	public void step_with_single_datatables(DataTable data) throws Throwable {

		List<String> dataItems = data.asList(String.class);

		for (String item : dataItems) {
			System.err.println(item);
		}
	}

	@Then("^step with multiple column datatables$")
	public void step_with_multiple_datatables(DataTable data) throws Throwable {
		List<List<String>> dataItems = data.asLists(String.class);

		System.out.println();
		System.out.println();
		for (int i = 0; i < dataItems.size(); i++) {
			for (int j = 0; j < dataItems.get(i).size(); j++) {
				System.out.print(dataItems.get(i).get(j) + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}

	@Then("^step with header datatables$")
	public void step_with_header_datatables(DataTable data) throws Throwable {
		List<Map<String, String>> listOfMaps = data.asMaps(String.class, String.class);

		for (Map<String, String> map : listOfMaps) {
			System.out.println(map);
		}
	}

}
