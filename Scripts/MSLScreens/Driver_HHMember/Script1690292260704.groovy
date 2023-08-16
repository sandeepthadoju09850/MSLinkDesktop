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


	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Tab_DriverHHMember'))

if ((hash_map.get('Driver_TabName') != null) && (hash_map.get('Driver_TabName').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Tab_DR_TabName',[('value') : hash_map.get('Driver_TabName')]))
}

if ((hash_map.get('Driver_Relationship') != null) && (hash_map.get('Driver_Relationship').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Btn_DR_Relationship'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Sel_DR_LI_LicenseStatus',
			[('value') : hash_map.get('Driver_Relationship')]))
}

if ((hash_map.get('Driver_HHMem_LicInfoLicStatus') != null) && (hash_map.get('Driver_HHMem_LicInfoLicStatus').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Btn_DR_LI_LicenseStatus'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Sel_DR_LI_LicenseStatus',
			[('value') : hash_map.get('Driver_HHMem_LicInfoLicStatus')]))
}


if ((hash_map.get('Driver_HHMem_LicInfLicNo') != null) && (hash_map.get('Driver_HHMem_LicInfLicNo').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_LI_LicenseNumber'),
		hash_map.get('Driver_HHMem_LicInfLicNo'))
}

if ((hash_map.get('Driver_HHMem_Gender') != null) && (hash_map.get('Driver_HHMem_Gender').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Btn_DR_Gender'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Sel_DR_Gender',
			[('value') : hash_map.get('Driver_HHMem_Gender')]))
}

if ((hash_map.get('Driver_HHMem_MaritalStatus') != null) && (hash_map.get('Driver_HHMem_MaritalStatus').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Btn_DR_MaritalStatus'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Sel_DR_MaritalStatus',
			[('value') : hash_map.get('Driver_HHMem_MaritalStatus')]))
}

if ((hash_map.get('Driver_HHMem_SSN') != null) && (hash_map.get('Driver_HHMem_SSN').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_SocialSecurityNumber'),
		hash_map.get('Driver_HHMem_SSN'))
}

if ((hash_map.get('Driver_HHMem_DOB') != null) && (hash_map.get('Driver_HHMem_DOB').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_DOB'),
		hash_map.get('Driver_HHMem_DOB'))
}

if ((hash_map.get('Driver_HHMem_Occupation') != null) && (hash_map.get('Driver_HHMem_Occupation').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_Occupation'),
		hash_map.get('Driver_HHMem_Occupation'))
}

if ((hash_map.get('Driver_HHMem_Date') != null) && (hash_map.get('Driver_HHMem_Date').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_V5Y_Date1'),
		hash_map.get('Driver_HHMem_Date'))
}
if ((hash_map.get('Driver_HHMem_AccVio') != null) && (hash_map.get('Driver_HHMem_AccVio').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Driver_HHMember/Txt_DR_V5Y_Violation1'),
		hash_map.get('Driver_HHMem_AccVio'))
}

