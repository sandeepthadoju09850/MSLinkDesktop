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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Tab_Home'))

if ((hash_map.get('DI_Construction') != null) && (hash_map.get('DI_Construction').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_Construction'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_DI_Construction',
			[('value') : hash_map.get('DI_Construction')]))
}

if ((hash_map.get('DI_YearBuilt') != null) && (hash_map.get('DI_YearBuilt').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_DI_YearBuilt'),
		hash_map.get('DI_YearBuilt'))
}
if ((hash_map.get('DI_NoOfFFam') != null) && (hash_map.get('DI_NoOfFFam').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_DI_NumberOfFamilies'),
		hash_map.get('DI_NoOfFFam'))
}
if ((hash_map.get('DI_NoofAptsUnits') != null) && (hash_map.get('DI_NoofAptsUnits').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_DI_NoAptsPerDivFire'),
		hash_map.get('DI_NoofAptsUnits'))
}

if ((hash_map.get('DI_RoofType') != null) && (hash_map.get('DI_RoofType').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_RoofType'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_DI_RoofType',
			[('value') : hash_map.get('DI_RoofType')]))
}


if ((hash_map.get('DI_PrimaryHeat') != null) && (hash_map.get('DI_PrimaryHeat').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_PrimaryHeat'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_DI_PrimaryHeat',
			[('value') : hash_map.get('DI_PrimaryHeat')]))
}

if ((hash_map.get('DI_SecondaryHeat') != null) && (hash_map.get('DI_SecondaryHeat').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_SecondaryHeat'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_DI_SecondaryHeat',
			[('value') : hash_map.get('DI_SecondaryHeat')]))
}

if ((hash_map.get('DI_LossesDuring3Years') != null) && (hash_map.get('DI_LossesDuring3Years').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_AnyLosses3YearsNo',[('value') : hash_map.get('DI_LossesDuring3Years')]))
}

if ((hash_map.get('DI_HLMTypeOfLoss') != null) && (hash_map.get('DI_HLMTypeOfLoss').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_HLH_TypeOfLoss'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_HLH_TypeOfLoss'),hash_map.get('DI_HLMTypeOfLoss'))
}

if ((hash_map.get('DI_HLHPaidBy') != null) && (hash_map.get('DI_HLHPaidBy').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_HLH_PaidBy'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_HLH_PaidBy'),hash_map.get('DI_HLHPaidBy'))

}

if ((hash_map.get('DI_HLHDateofLoss') != null) && (hash_map.get('DI_HLHDateofLoss').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_HLH_DateOfLoss'),
		hash_map.get('DI_HLHDateofLoss'))
}

if ((hash_map.get('DI_HLHAmountPaid') != null) && (hash_map.get('DI_HLHAmountPaid').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_HLH_Amount'),
		hash_map.get('DI_HLHAmountPaid'))
}
if ((hash_map.get('DI_HLH_BrefDesofLoss') != null) && (hash_map.get('DI_HLH_BrefDesofLoss').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_HLH_Description'),
		hash_map.get('DI_HLH_BrefDesofLoss'))
}

if ((hash_map.get('DI_HLH_AddSave') != null) && (hash_map.get('DI_HLH_AddSave').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_HLH_AddSave'))
}

if ((hash_map.get('DI_HLHOK') != null) && (hash_map.get('DI_HLHOK').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_OK'))
}

if ((hash_map.get('DI_IsSwimmingPool') != null) && (hash_map.get('DI_IsSwimmingPool').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_SwimmingPoolNo'))
}

if ((hash_map.get('DI_AnyAnimals') != null) && (hash_map.get('DI_AnyAnimals').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_AnyAnimalsNo'))
}
if ((hash_map.get('DI_AnyTrampoline') != null) && (hash_map.get('DI_AnyTrampoline').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_TrampolineNo'))
}
if ((hash_map.get('DI_SkateBoardRampBiscycleJump') != null) && (hash_map.get('DI_SkateBoardRampBiscycleJump').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_SkateBoardBicycleNo'))
}

if ((hash_map.get('DI_PropertyMoreThan5Acres') != null) && (hash_map.get('DI_PropertyMoreThan5Acres').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_DI_MoreThan5AcresNo'))
}

if ((hash_map.get('DI_HomeRenovations') != null) && (hash_map.get('DI_HomeRenovations').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_HomeRenovations'))
}

if ((hash_map.get('DI_HR_RoofingNotUpdated') != null) && (hash_map.get('DI_HR_RoofingNotUpdated').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_HR_RoofingNotUpdate'))
}
if ((hash_map.get('DI_HR_WiringNotUpdated') != null) && (hash_map.get('DI_HR_WiringNotUpdated').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_RV_WiringNotUpdate'))
}
if ((hash_map.get('DI_HR_Min100AmpCircuitBreakers') != null) && (hash_map.get('DI_HR_Min100AmpCircuitBreakers').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_RV_Min100AmpCrtBreak',
			[('value') : hash_map.get('DI_HR_Min100AmpCircuitBreakers')]))
}
if ((hash_map.get('DI_HR_AnyFusesInDwellig') != null) && (hash_map.get('DI_HR_AnyFusesInDwellig').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_RV_WireFusesDwelling',
			[('value') : hash_map.get('DI_HR_AnyFusesInDwellig')]))
}

if ((hash_map.get('DI_HR-HeatingNotupdated') != null) && (hash_map.get('DI_HR-HeatingNotupdated').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_RV_HeatingNotUpdated'))
}
if ((hash_map.get('DI_HR_PlumbingNotUpdated') != null) && (hash_map.get('DI_HR_PlumbingNotUpdated').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_RV_PlumblingNotUpdated'))
}
if ((hash_map.get('DI_HROK') != null) && (hash_map.get('DI_HROK').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_OK'))
}

if ((hash_map.get('DI_HomeDiscounts') != null) && (hash_map.get('DI_HomeDiscounts').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_HomeDiscounts'))
}
if ((hash_map.get('DI_HomeDiscCheckBoxValues') != null) && (hash_map.get('DI_HomeDiscCheckBoxValues').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Chk_HD_CheckBoxValues',
			[('value') : hash_map.get('DI_HomeDiscCheckBoxValues')]))
}
if ((hash_map.get('DI_HDOK') != null) && (hash_map.get('DI_HDOK').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_OK'))
}

if ((hash_map.get('DI_CovInfForm') != null) && (hash_map.get('DI_CovInfForm').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_CI_Form'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_Form',[('value') : hash_map.get('DI_CovInfForm')]))

}
if ((hash_map.get('DI_CovInfDeductible') != null) && (hash_map.get('DI_CovInfDeductible').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_CI_Deductible'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_Deductible',[('value') : hash_map.get('DI_CovInfDeductible')]))

}
if ((hash_map.get('DI_CovInfWindHailded') != null) && (hash_map.get('DI_CovInfWindHailded').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_CI_HailWindDect'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_HailWindDect',[('value') : hash_map.get('DI_CovInfWindHailded')]))

}

if ((hash_map.get('DI_CovInfDwelling') != null) && (hash_map.get('DI_CovInfDwelling').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_CI_Dwelling'),
		hash_map.get('DI_CovInfDwelling'))
}

if ((hash_map.get('DI_CovcovInfPP') != null) && (hash_map.get('DI_CovcovInfPP').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Txt_CI_PersonalProperty'),
		hash_map.get('DI_CovcovInfPP'))
}

if ((hash_map.get('DI_CovInfMedPay') != null) && (hash_map.get('DI_CovInfMedPay').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_CI_MedicalPayments'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_MedicalPayment',[('value') : hash_map.get('DI_CovInfMedPay')]))

}
if ((hash_map.get('DI_CovInfPersonalLiability') != null) && (hash_map.get('DI_CovInfPersonalLiability').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_CI_PersonalLiability'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_CI_MedicalPayment',[('value') : hash_map.get('DI_CovInfPersonalLiability')]))

}

if ((hash_map.get('DI_PolicyHolderInsuredWithSecura') != null) && (hash_map.get('DI_PolicyHolderInsuredWithSecura').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_PolicyHolderInsuredSecura'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Sel_DI_PolicyHolderInsuredSecura',[('value') : hash_map.get('DI_PolicyHolderInsuredWithSecura')]))

}

if ((hash_map.get('DI_BTN_Questions') != null) && (hash_map.get('DI_BTN_Questions').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DI_Questions'))
	
}

if ((hash_map.get('DQ_BTN_Yes') != null) && (hash_map.get('DQ_BTN_Yes').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Home_DwellingInfo/Btn_DQ_Yes'))
	
}

