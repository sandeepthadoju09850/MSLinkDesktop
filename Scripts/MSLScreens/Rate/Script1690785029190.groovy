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

def hash_map = pageData.get((GlobalVariable.TestCase + '-') + strIndex)

if ((hash_map.get('BTN_Rate') != null) && (hash_map.get('BTN_Rate').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_RATE'))
}

if ((hash_map.get('BTN_AddressValidationYes') != null) && (hash_map.get('BTN_AddressValidationYes').length() > 0)) {
    

    Windows.delay(8)

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_AddressChangeYes'))

    Windows.delay(5)
	
	
	
}
/*
if ((hash_map.get('MSL_StopedWorking') != null) && (hash_map.get('MSL_StopedWorking').length() > 0)) {
	
	Windows.switchToDesktop()
	
		CustomKeywords.'customeKeyword.WindowsImprovedKeywords.switchToWindowTitle'('MS-Link')
		
		Windows.closeApplication()
		
		//CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_Win_Close'))
		
		CustomKeywords.'customeKeyword.WindowsImprovedKeywords.switchToWindowTitle'('SECURA\'s MILE-STONe Link')
}
*/
if ((hash_map.get('BTN_RateMessageOK') != null) && (hash_map.get('BTN_RateMessageOK').length() > 0)) {
	Windows.delay(5)
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_RateMessage_OK'))
}



/*
Boolean Win = Windows.verifyElementPresent(findWindowsObject('MSLink/RateDetails/Btn_Win_Close'), 5)
if(Win) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('MSLink/RateDetails/Btn_Win_Close'))	
}
*/
if ((hash_map.get('BTN_UnableToRateOK') != null) && (hash_map.get('BTN_UnableToRateOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UW_OK'))
}

if ((hash_map.get('TotalPremium') != null) && (hash_map.get('TotalPremium').length() > 0)) {
    GlobalVariable.ActTotalPolicyPremium = Windows.getText(findWindowsObject('MSLink/RateDetails/Lbl_Rate_PolicyPremium'))
	GlobalVariable.ExptTotalPolicyPremium = hash_map.get('TotalPremium')
	if(GlobalVariable.ActTotalPolicyPremium.equals(GlobalVariable.ExptTotalPolicyPremium)) {
		GlobalVariable.TotalPremiumResult='Pass'
	}else {
		GlobalVariable.TotalPremiumResult='Fail'
	}
    Windows.verifyEqual(GlobalVariable.ActTotalPolicyPremium, GlobalVariable.ExptTotalPolicyPremium, FailureHandling.OPTIONAL)
}

if ((hash_map.get('AutoPremium') != null) && (hash_map.get('AutoPremium').length() > 0)) {
    GlobalVariable.ActAutoPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_AutoPremium'))
	GlobalVariable.ExptAutoPremium = hash_map.get('AutoPremium')
	if(GlobalVariable.ActAutoPremium.equals(GlobalVariable.ExptAutoPremium)) {
		GlobalVariable.AutoPremiumResult='Pass'
	}else {
		GlobalVariable.AutoPremiumResult='Fail'
	}
    Windows.verifyEqual(GlobalVariable.ActAutoPremium, GlobalVariable.ExptAutoPremium, FailureHandling.OPTIONAL)
}

if ((hash_map.get('PrimaryResidencyPremium') != null) && (hash_map.get('PrimaryResidencyPremium').length() > 0)) {
    GlobalVariable.ActPrimaryResidencyPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_PrimaryResidencyPremium'))
	GlobalVariable.ExptPrimaryResidencyPremium = hash_map.get('PrimaryResidencyPremium')
    
	if(GlobalVariable.ActPrimaryResidencyPremium.equals(GlobalVariable.ExptPrimaryResidencyPremium)) {
		GlobalVariable.PrimaryResidencyPremiumResult='Pass'
	}else {
		GlobalVariable.PrimaryResidencyPremiumResult='Fail'
	}
	Windows.verifyEqual(GlobalVariable.ActPrimaryResidencyPremium, GlobalVariable.ExptPrimaryResidencyPremium, FailureHandling.OPTIONAL)
}

if ((hash_map.get('UmbrellaPremium') != null) && (hash_map.get('UmbrellaPremium').length() > 0)) {
    GlobalVariable.ActUmbrellaPremium = Windows.getText(findWindowsObject('Object Repository/MSLink/RateDetails/Lbl_Rate_UmbrellaPremium'))
	GlobalVariable.ExptUmbrellaPremium = hash_map.get('UmbrellaPremium')
	
	if(GlobalVariable.ActUmbrellaPremium.equals(GlobalVariable.ExptUmbrellaPremium)) {
		GlobalVariable.UmbrellaPremiumResult='Pass'
	}else {
		GlobalVariable.UmbrellaPremiumResult='Fail'
	}
	Windows.verifyEqual(GlobalVariable.ActUmbrellaPremium, GlobalVariable.ExptUmbrellaPremium, FailureHandling.OPTIONAL)
}

if ((hash_map.get('BTN_RateClose') != null) && (hash_map.get('BTN_RateClose').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_Rate_Close'))
	Windows.closeApplication()
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/RateDetails/Btn_SaveQuoteNo'))
	
	}

