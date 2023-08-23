package customeKeyword

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

public class Customkeywords {

	@Keyword
	def retrieveRowByIdAndIndex(String strDataFileName, String strCaseld, String strIndex) {

		String strDataFilePath = strDataFileName;
		int intRowIndex = findRowByIdAndIndex(strDataFilePath, strCaseld, strIndex);
		String[] Columnnames = findTestData(strDataFilePath).getColumnNames();
		HashMap<String, String> hash_map = new HashMap<String, String>();

		for (String str in Columnnames) {
			if(str != null && !str.equalsIgnoreCase ("TestCaseld") ) {
				hash_map.put(str, findTestData(strDataFilePath).getValue(str, intRowIndex))
			}
		}
		return hash_map;
	}

	@Keyword
	def int findRowByIdAndIndex(String strDataFileName, String strCaseld, String strIndex) {
		int intRowIndex = - 1
		int intNumberOfRows = findTestData(strDataFileName).getRowNumbers()

		for (def iRow : 1..intNumberOfRows){
			String strCombinedTestCase = strCaseld + '-' + strIndex;
			String strActualTestCaseId=findTestData(strDataFileName).getValue(1,iRow)
			if(strCombinedTestCase.equalsIgnoreCase(strActualTestCaseId)){
				intRowIndex = iRow;
				print "Located Test Case Id: "+ strCaseld +" @ ROw: " + intRowIndex;
				break;
			}
		}

		return intRowIndex
	}


	@Keyword
	def pageValidation(def to, String ExpectedPageName) {
		String ActualPageName = WebUI.getText(to, FailureHandling.STOP_ON_FAILURE)
		if(ActualPageName.equals(ExpectedPageName)) {
			println "Navigated to Expected Screen" + ExpectedPageName
			return true
		}
		else {
			println "Navigated to different screen" + ActualPageName
			return false
		}
	}

	@Keyword
	def sendKeys(def to,String value) {
		
		Windows.sendKeys(to, value)
		
	}



	@Keyword
	def click(def to) {
		//Windows.waitForElementPresent(to, 10, FailureHandling.CONTINUE_ON_FAILURE)
		
		Windows.click(to, FailureHandling.STOP_ON_FAILURE)
		
	}

	@Keyword
	def retrieveTestCaseData(String strDataFileName, String strCaseId) {

		String strDataFilePath = strDataFileName;
		TestData testData = findTestData(strDataFilePath);
		String[] columnNames = testData.getColumnNames();
		int dataRowsCount = testData.getRowNumbers();
		HashMap<String, HashMap> hash_map = new  HashMap<String, HashMap>();

		for (def iRow : 1..dataRowsCount) {
			String strTestCaseID = testData.getValue(1, iRow)
			if (strTestCaseID.startsWith(strCaseId)) {
				HashMap<String, String> innerMap = new  HashMap<String, String>();
				for (String str in columnNames) {
					if(str != null && !str.equalsIgnoreCase("TestCaseId") ) {
						innerMap.put(str, testData.getValue(str, iRow))
					}
				}
				hash_map. put(strTestCaseID, innerMap)
			}
		}
		return hash_map;
	}
}