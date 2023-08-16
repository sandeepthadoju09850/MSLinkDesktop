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

CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Tab_Auto'))

if ((hash_map.get('Add_Auto') != null) && (hash_map.get('Add_Auto').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_AddAuto'))	
}

if ((hash_map.get('Auto_VehInfVIN') != null) && (hash_map.get('Auto_VehInfVIN').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_VIN'), 
        hash_map.get('Auto_VehInfVIN'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_AnnualMileage'))
	
	}

if ((hash_map.get('Auto_Year') != null) && (hash_map.get('Auto_Year').length() > 0)) {
		String AutoYear = Windows.getText(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_Year'))
		Windows.verifyEqual(AutoYear, hash_map.get('Auto_Year') ,FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('Auto_Make') != null) && (hash_map.get('Auto_Make').length() > 0)) {
	String AutoMake = Windows.getText(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_Make'))
	Windows.verifyEqual(AutoMake, hash_map.get('Auto_Make') ,FailureHandling.CONTINUE_ON_FAILURE)
}

if ((hash_map.get('Auto_Model') != null) && (hash_map.get('Auto_Model').length() > 0)) {
	String AutoModel = Windows.getText(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_Model'))
	Windows.verifyEqual(AutoModel, hash_map.get('Auto_Model') ,FailureHandling.CONTINUE_ON_FAILURE)
}

/*if ((hash_map.get('Auto_SymbolTwo') != null) && (hash_map.get('Auto_SymbolTwo').length() > 0)) {
	String AutoSymbolTwo = Windows.getText(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_Year'))
	Windows.verifyEqual(AutoSymbolTwo, hash_map.get('Auto_SymbolTwo') ,FailureHandling.CONTINUE_ON_FAILURE)
}
*/


if ((hash_map.get('Auto_VehInfType') != null) && (hash_map.get('Auto_VehInfType').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_VehicleType'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_VehicleType', 
            [('value') : hash_map.get('Auto_VehInfType')]))
}

if ((hash_map.get('Auto_VehInfUsage') != null) && (hash_map.get('Auto_VehInfUsage').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_Usage'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_Usage', 
            [('value') : hash_map.get('Auto_VehInfUsage')]))
}

if ((hash_map.get('Auto_VehInfAnnMil') != null) && (hash_map.get('Auto_VehInfAnnMil').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_AnnualMileage'), 
        hash_map.get('Auto_VehInfAnnMil'))
}

if ((hash_map.get('Auto_CovBI') != null) && (hash_map.get('Auto_CovBI').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_BidilyInjury'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_BodilyInjury', 
            [('value') : hash_map.get('Auto_CovBI')]))
}

if ((hash_map.get('Auto_CovPD') != null) && (hash_map.get('Auto_CovPD').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PropertyDamage'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_PropertyDamage', 
            [('value') : hash_map.get('Auto_CovPD')]))
}

if ((hash_map.get('Auto_CovMedPay') != null) && (hash_map.get('Auto_CovMedPay').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_MedicalPayment'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_MedicalPayment', 
            [('value') : hash_map.get('Auto_CovMedPay')]))
}

if ((hash_map.get('Auto_UninsMot') != null) && (hash_map.get('Auto_UninsMot').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UninsuredMotorist'))

    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_UninsuredMotorist', 
            [('value') : hash_map.get('Auto_UninsMot')]))
}

if ((hash_map.get('Auto_UnderInsMot') != null) && (hash_map.get('Auto_UnderInsMot').length() > 0)) {
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_CI_UnderInsMotr'))

	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_UninsuredMotorist',
			[('value') : hash_map.get('Auto_UnderInsMot')]))
}

if ((hash_map.get('Auto_OtherInfPrCarAutoInfBtn') != null) && (hash_map.get('Auto_OtherInfPrCarAutoInfBtn').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PriorCarrierInfo'))
}

//Windows.switchToWindowTitle('Auto Prior Carrier')
if ((hash_map.get('Auto_PriorCar') != null) && (hash_map.get('Auto_PriorCar').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_PriorCarrier'))

	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_PriorCarrier'),hash_map.get('Auto_PriorCar'))
	//CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_PC_PrriorCarrier', [('value') : hash_map.get('Auto_PriorCar')]))
}

if ((hash_map.get('Auto_APCPriCarBIlimPerPerson') != null) && (hash_map.get('Auto_APCPriCarBIlimPerPerson').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_BIPerPerson'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_BIPerPerson'),hash_map.get('Auto_APCPriCarBIlimPerPerson'))
	
    //CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_PC_BIPerPerson', [('value') : hash_map.get('Auto_APCPriCarBIlimPerPerson')]))
}

if ((hash_map.get('Auto_APCPriCarBIlimPerOcc') != null) && (hash_map.get('Auto_APCPriCarBIlimPerOcc').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_BIPerOccurance'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_BIPerOccurance'),hash_map.get('Auto_APCPriCarBIlimPerOcc'))
	
    //CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Sel_AT_PC_BIPerOccurance', [('value') : hash_map.get('Auto_APCPriCarBIlimPerOcc')]))
}

if ((hash_map.get('Auto_APCExpDate') != null) && (hash_map.get('Auto_APCExpDate').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_PC_ExpirationDate'), 
        hash_map.get('Auto_APCExpDate'))
}

if ((hash_map.get('Auto_APCNofYrs') != null) && (hash_map.get('Auto_APCNofYrs').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/Auto/Txt_AT_PC_YearsInsured'), 
        hash_map.get('Auto_APCNofYrs'))
}

if ((hash_map.get('Auto_APC_OK') != null) && (hash_map.get('Auto_APC_OK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_PC_OK'))
}

//Windows.switchToWindowTitle('SECURA\'s MILE-STONe Link')
if ((hash_map.get('Auto_UnderwritingInfo') != null) && (hash_map.get('Auto_UnderwritingInfo').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UW_UWInfo'))
}

//Windows.switchToWindowTitle('Underwriting Information - 2018 AUDI A4 SEDAN 4D')
if ((hash_map.get('UW_IsThisVehicleTitledInsPer') != null) && (hash_map.get('UW_IsThisVehicleTitledInsPer').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Chk_AT_UW_VehicleTitleInsuredName', 
            [('value') : hash_map.get('UW_IsThisVehicleTitledInsPer')]))
}

if ((hash_map.get('UW_DoesVehicleHaveAdvertisingSignage') != null) && (hash_map.get('UW_DoesVehicleHaveAdvertisingSignage').length() > 
0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Chk_AT_UW_VehicleAdvertise', 
            [('value') : hash_map.get('UW_DoesVehicleHaveAdvertisingSignage')]))
}

if ((hash_map.get('UW_IsVechileUsedDeliveryTransporting') != null) && (hash_map.get('UW_IsVechileUsedDeliveryTransporting').length() > 
0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Chk_AT_UW_VehicleUsedForDelivery', 
            [('value') : hash_map.get('UW_IsVechileUsedDeliveryTransporting')]))
}

if ((hash_map.get('UW_DoYouUseThisVehicleTravel') != null) && (hash_map.get('UW_DoYouUseThisVehicleTravel').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Chk_AT_UW_VehicleUsedForTravel', 
            [('value') : hash_map.get('UW_DoYouUseThisVehicleTravel')]))
}

if ((hash_map.get('Auto_UnderwritingInfoOK') != null) && (hash_map.get('Auto_UnderwritingInfoOK').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/Auto/Btn_AT_UW_OK'))
}

