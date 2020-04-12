package com.sprintqa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class DataTableValidationPage extends CommonMethods {

	public final String XPATH_TABLE_DATA = "//table[@class='table']/tbody/tr[rowNumber]/td[colNumber]";

	@FindBy(xpath = "//table[@class='table']/tbody/tr")
	public List<WebElement> listOfRows;

	@FindBy(xpath = "//table[@class='table']/thead/tr/th")
	public List<WebElement> listOfCol;

	public static void main(String[] args) {
		String str = "Welcome Chirag";
		System.out.println(str.replace("Chirag", "Kamil"));
	}

	WebDriver driver;

	public DataTableValidationPage(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	public void retriveData(List<List<String>> dataList) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= listOfRows.size(); i++) {
			for (int j = 1; j <= listOfCol.size(); j++) {
				
				String loc = XPATH_TABLE_DATA.replace("rowNumber", String.valueOf(i)).replace("colNumber",
						String.valueOf(j));
				WebElement tableDataEle = driver.findElement(By.xpath(loc));
				
				String expDataFromWeb = tableDataEle.getText();
				String actDataFromFeat = dataList.get(i - 1).get(j - 1);
				System.out.println(expDataFromWeb);
				System.out.println(actDataFromFeat);
				
				Assert.assertTrue("Data on web not match with feature file", expDataFromWeb.equals(actDataFromFeat));
			}
			System.out.println();
		}
	}

	public void openDemoWeb() {
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	}

}
