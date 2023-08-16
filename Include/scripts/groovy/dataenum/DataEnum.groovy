package dataenum

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

import internal.GlobalVariable



enum DataFiles {

	LAUNCHAPP("LaunchApp"),
	PIINSBILLINGINFO("PI_InsBillingInfo"),
	PIPDISCOUNTCOVERAGE("PI_PolicyDiscCov"),
	DRIVERHHMEMBER("Driver_HHMember"),
	DRIVERASSGINMENT("Driver_Assignment"),
	HOMEDWELLING("Home_Dwelling"),
	UMBRELLA("Umbrella"),
	OTHERINFOAUTO("OtherInfo_Auto"),
	OTHERINFOPRIMARYDWELLING("OtherInfo_PrimaryDwelling"),
	OTHERINFOGENINFO("OtherInfo_GenInfo"),
	OTHERINFOUMBRELLA("OtherInfo_Umbrella"),
	RATEDETAILS("Rate_Details"),
	AUTO("Auto");

	private String page;

	private DataFiles(String page) {
		this.page = page;
	}

	public String getSheetName() {
		return this.page;
	}
}

enum DriverType{

	CHROME("CHROME"),

	private String lbl;

	public String getDriveType() {
		return this.lbl;
	}

	private DriverType(String lbl) {
		this.lbl = lbl;
	}
}