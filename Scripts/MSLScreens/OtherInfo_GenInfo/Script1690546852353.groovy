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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_GenInfo/Tab_GeneralInfo'))

if ((hash_map.get('OI_GI_AgencyContact') != null) && (hash_map.get('OI_GI_AgencyContact').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_GenInfo/Txt_GI_AgencyContact'),
		hash_map.get('OI_GI_AgencyContact'))
}

if ((hash_map.get('OI_GIAgencyEMail') != null) && (hash_map.get('OI_GIAgencyEMail').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_GenInfo/Txt_GI_AgencyEmail'),
		hash_map.get('OI_GIAgencyEMail'))
}
if ((hash_map.get('OI_GIAgncyContactPh') != null) && (hash_map.get('OI_GIAgncyContactPh').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_GenInfo/Txt_GI_AgencyPhone'),
		hash_map.get('OI_GIAgncyContactPh'))
}

if ((hash_map.get('OI_PaymentInfo') != null) && (hash_map.get('OI_PaymentInfo').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_GenInfo/Chk_GI_PaymentOption',
			[('value') : hash_map.get('OI_PaymentInfo')]))
}
