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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Tab_PI_PolicyDiscAndCov'))


if ((hash_map.get('PDC_FinStability') != null) && (hash_map.get('PDC_FinStability').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Btn_PI_FinancialStability'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Sel_PI_FinancialStability',['value':hash_map.get('PDC_FinStability')]))
}

if ((hash_map.get('PDC_WelcomeDisc') != null) && (hash_map.get('PDC_WelcomeDisc').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Btn_PI_WelcomeDiscont'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Sel_PI_WelcomeDiscount',['value':hash_map.get('PDC_WelcomeDisc')]))
}

if ((hash_map.get('PDC_EarlyDiscount') != null) && (hash_map.get('PDC_EarlyDiscount').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Btn_EarlyDiscount'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Sel_PI_WelcomeDiscount',['value':hash_map.get('PDC_EarlyDiscount')]))
}

if ((hash_map.get('PDC_GroupAssoc') != null) && (hash_map.get('PDC_GroupAssoc').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Btn_PI_GroupAssociation'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_PolicyDiscAndCov/Sel_PI_GroupAssociation',['value':hash_map.get('PDC_GroupAssoc')]))
}


