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

if ((hash_map.get('IB_Agency') != null) && (hash_map.get('IB_Agency').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_AgencyName'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_AgencyName'),
		hash_map.get('IB_Agency'))
     CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_AgencyName'))
} 

if ((hash_map.get('IB_PolicyType') != null) && (hash_map.get('IB_PolicyType').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyType'))

   CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_Usage',[('value') : hash_map.get('IB_PolicyType')]))
} 

if ((hash_map.get('IB_PayPlan') != null) && (hash_map.get('IB_PayPlan').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyPlan'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_Usage',[('value') : hash_map.get('IB_PayPlan')]))
}	


if ((hash_map.get('IB_NameInsFirst') != null) && (hash_map.get('IB_NameInsFirst').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_FirstInsuredName'), 
        hash_map.get('IB_NameInsFirst'))
}

if ((hash_map.get('IB_NameInLast') != null) && (hash_map.get('IB_NameInLast').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_Pi_LastInsuredName'), 
        hash_map.get('IB_NameInLast'))
}

if ((hash_map.get('IB_AddNamedInFirst') != null) && (hash_map.get('IB_AddNamedInFirst').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_AddInsredFirstName'), 
        hash_map.get('IB_AddNamedInFirst'))
}

if ((hash_map.get('IB_LocAddHouse') != null) && (hash_map.get('IB_LocAddHouse').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_LocationHouseAdd'), 
        hash_map.get('IB_LocAddHouse'))
}

if ((hash_map.get('IB_LocAddDir') != null) && (hash_map.get('IB_LocAddDir').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_Direction'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_HailWindDect',[('value') : hash_map.get('IB_LocAddDir')]))

}

if ((hash_map.get('IB_LocAddStName') != null) && (hash_map.get('IB_LocAddStName').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_StreetName'), 
        hash_map.get('IB_LocAddStName'))
}

if ((hash_map.get('IB_LocAddStType') != null) && (hash_map.get('IB_LocAddStType').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_StreetType'), 
        hash_map.get('IB_LocAddStType'))
}

if ((hash_map.get('IB_LocAddCity') != null) && (hash_map.get('IB_LocAddCity').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_City'), 
        hash_map.get('IB_LocAddCity'))
}

if ((hash_map.get('IB_LocAddZipCode') != null) && (hash_map.get('IB_LocAddZipCode').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_Zip'), 
        hash_map.get('IB_LocAddZipCode'))
}

if ((hash_map.get('IB_Phone') != null) && (hash_map.get('IB_Phone').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_PhoneNumber'), 
        hash_map.get('IB_Phone'))
}

if ((hash_map.get('IB_OptDes') != null) && (hash_map.get('IB_OptDes').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Txt_PI_OptionalDesc'), 
        hash_map.get('IB_OptDes'))
}