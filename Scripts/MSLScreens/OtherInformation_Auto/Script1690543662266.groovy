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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Tab_OtherInfo'))

if ((hash_map.get('AT_AnyEncumbrancesVehicleNotSolelyOwned') != null) && (hash_map.get('AT_AnyEncumbrancesVehicleNotSolelyOwned').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyVehicleSoleyNotOwnedBy',
			[('value') : hash_map.get('AT_AnyEncumbrancesVehicleNotSolelyOwned')]))
}

if ((hash_map.get('AT_CarModifiedSpecialEquipment') != null) && (hash_map.get('AT_CarModifiedSpecialEquipment').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_CarModifiedSpecialEquipment',
			[('value') : hash_map.get('AT_CarModifiedSpecialEquipment')]))
}

if ((hash_map.get('AT_ExistingDamageToVehicle') != null) && (hash_map.get('AT_ExistingDamageToVehicle').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_ExistingDamageToVehicle',
			[('value') : hash_map.get('AT_ExistingDamageToVehicle')]))
}

if ((hash_map.get('AT_AnyOtherLosses') != null) && (hash_map.get('AT_AnyOtherLosses').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyOtherLosses',
			[('value') : hash_map.get('AT_AnyOtherLosses')]))
}

if ((hash_map.get('AT_AnyCarKeptAtSchool') != null) && (hash_map.get('AT_AnyCarKeptAtSchool').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyCarKeptAtSchool',
			[('value') : hash_map.get('AT_AnyCarKeptAtSchool')]))
}

if ((hash_map.get('AT_AnyAutoInsuredHousehold') != null) && (hash_map.get('AT_AnyAutoInsuredHousehold').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyAutoInsuredHousehold',
			[('value') : hash_map.get('AT_AnyAutoInsuredHousehold')]))
}

if ((hash_map.get('AT_AnyFinancialRespoFilling') != null) && (hash_map.get('AT_AnyFinancialRespoFilling').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyFinancialRespoFilling',
			[('value') : hash_map.get('AT_AnyFinancialRespoFilling')]))
}

if ((hash_map.get('AT_AnyCoveDeclinedCanceled3Years') != null) && (hash_map.get('AT_AnyCoveDeclinedCanceled3Years').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyCoveDeclinedCanceled3Years',
			[('value') : hash_map.get('AT_AnyCoveDeclinedCanceled3Years')]))
}

if ((hash_map.get('AT_AnyVehicleUsedRideSharing') != null) && (hash_map.get('AT_AnyVehicleUsedRideSharing').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Chk_OI_AT_AnyVehicleUsedRideSharing',
			[('value') : hash_map.get('AT_AnyVehicleUsedRideSharing')]))
}