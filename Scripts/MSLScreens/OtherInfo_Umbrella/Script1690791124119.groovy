import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def strIndex = "$index"

def hash_map = pageData.get(((GlobalVariable.TestCase) + '-') + strIndex)

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Umbrella/Tab_OtherInfo_Umbrella'))

if ((hash_map.get('AnyAircraftOwnedLeased') != null) && (hash_map.get('AnyAircraftOwnedLeased').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Umbrella/Chk_UM_ANYAircraftOwnedLeased',
			[('value') : hash_map.get('AnyAircraftOwnedLeased')]))
}
if ((hash_map.get('AnyRealestateVehicle') != null) && (hash_map.get('AnyRealestateVehicle').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Umbrella/Chk_UM_AnyRealestateVehicle',
			[('value') : hash_map.get('AnyRealestateVehicle')]))
}
if ((hash_map.get('DoYouHoldNonCompensate') != null) && (hash_map.get('DoYouHoldNonCompensate').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Umbrella/Chk_UM_DoHoldNonCompensate',
			[('value') : hash_map.get('DoYouHoldNonCompensate')]))
}