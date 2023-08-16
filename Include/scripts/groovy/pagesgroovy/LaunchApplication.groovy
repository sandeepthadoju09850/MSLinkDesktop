package pagesgroovy

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import internal.GlobalVariable
import customeKeyword.Customkeywords
import dataenum.DataFiles


class LaunchApplication {


	private String dataSheetPath = GlobalVariable.TestData + "/" + DataFiles.LAUNCHAPP.getSheetName();

	private HashMap pageData;

	public LaunchApplication() {

		pageData = new Customkeywords().retrieveTestCaseData(dataSheetPath, GlobalVariable.TestCase);
	}

	@Given("Launch MSL Application - (.*)")
	def launchApplication(String index) {
		WebUI.callTestCase(findTestCase('Test Cases/MSLScreens/NewQuote'), ['pageData' :pageData, 'index' :index])
	}
}