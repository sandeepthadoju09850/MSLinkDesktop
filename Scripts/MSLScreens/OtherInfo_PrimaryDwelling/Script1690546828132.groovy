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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Tab_PrimaryDwelling'))


if ((hash_map.get('PD_PriorCarrier') != null) && (hash_map.get('PD_PriorCarrier').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Btn_OI_AT_PriorCarrier'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Sel_OI_AT_ForAllDD',
			[('value') : hash_map.get('PD_PriorCarrier')]))
}


if ((hash_map.get('PD_ExpDate') != null) && (hash_map.get('PD_ExpDate').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Txt_PD_ExperiationDate'),
		hash_map.get('PD_ExpDate'))
}

if ((hash_map.get('PD_YearsInsuredWithPrioCar') != null) && (hash_map.get('PD_YearsInsuredWithPrioCar').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_Auto/Txt_OI_AT_NoYearsInsuredPC'),
		hash_map.get('PD_YearsInsuredWithPrioCar'))
}

if ((hash_map.get('PD_YearOfOccupancy') != null) && (hash_map.get('PD_YearOfOccupancy').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Txt_PD_YearOfOccupancy'),
		hash_map.get('PD_YearOfOccupancy'))
}

if ((hash_map.get('PD_TotalLivingArea') != null) && (hash_map.get('PD_TotalLivingArea').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Txt_PD_DwwllingArea'),
		hash_map.get('PD_TotalLivingArea'))
}

if ((hash_map.get('PD_AnyBusinesConductedPremises') != null) && (hash_map.get('PD_AnyBusinesConductedPremises').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_AnyBusinesConductedPremises',
			[('value') : hash_map.get('PD_AnyBusinesConductedPremises')]))
}

if ((hash_map.get('PD_AnyOtherResidenceOwnedOccupiedRented') != null) && (hash_map.get('PD_AnyOtherResidenceOwnedOccupiedRented').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_AnyOtherResidenceOwnedOccupiedRented',
			[('value') : hash_map.get('PD_AnyOtherResidenceOwnedOccupiedRented')]))
}

if ((hash_map.get('PD_AnyCoverageDeclinedCancelledNonRenewedLast3Years') != null) && (hash_map.get('PD_AnyCoverageDeclinedCancelledNonRenewedLast3Years').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_AnyCoverageDeclinedCancelledNonRenewedLast3Years',
			[('value') : hash_map.get('PD_AnyCoverageDeclinedCancelledNonRenewedLast3Years')]))
}

if ((hash_map.get('PD_AnyOutbuildingsOtherThanPrivateGarage') != null) && (hash_map.get('PD_AnyOutbuildingsOtherThanPrivateGarage').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_AnyOutbuildingsOtherThanPrivateGarage',
			[('value') : hash_map.get('PD_AnyOutbuildingsOtherThanPrivateGarage')]))
}

if ((hash_map.get('PD_ApplicantOwnAnyRecreationalVehicles') != null) && (hash_map.get('PD_ApplicantOwnAnyRecreationalVehicles').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_ApplicantOwnAnyRecreationalVehicles',
			[('value') : hash_map.get('PD_ApplicantOwnAnyRecreationalVehicles')]))
}

if ((hash_map.get('PD_ApplicantLivedLess3YearsCurrentAddress') != null) && (hash_map.get('PD_ApplicantLivedLess3YearsCurrentAddress').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_ApplicantLivedLess3YearsCurrentAddress',
			[('value') : hash_map.get('PD_ApplicantLivedLess3YearsCurrentAddress')]))
}

if ((hash_map.get('PD_AnyFarmingOnPremises') != null) && (hash_map.get('PD_AnyFarmingOnPremises').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_AnyFarmingOnPremises',
			[('value') : hash_map.get('PD_AnyFarmingOnPremises')]))
}

if ((hash_map.get('PD_PropertyRentedOutHomeSharingAirBbBVRBo') != null) && (hash_map.get('PD_PropertyRentedOutHomeSharingAirBbBVRBo').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/OtherInfo_PrimaryDwelling/Chk_PD_PropertyRentedOutHomeSharingAirBbBVRBo',
			[('value') : hash_map.get('PD_PropertyRentedOutHomeSharingAirBbBVRBo')]))
}