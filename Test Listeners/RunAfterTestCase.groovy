import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class RunAfterTestCase {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
		
		Date todaysDate = new Date();
		GlobalVariable.formattedDate = todaysDate.format("dd-MM hh-mm");
		String filename = "C:\\Users\\sa09850\\Katalon Studio\\My First Desktop Project\\Reports\\"+GlobalVariable.TestCase+"RateReport"+GlobalVariable.formattedDate+".xlsx";

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("RateReport");
		
		XSSFRow rowhead = sheet.createRow((short)0);
		//rowhead.createCell(0).setCellValue("ActualPremiums");
		rowhead.createCell(1).setCellValue("ActualPremiums");
		rowhead.createCell(2).setCellValue("ExpectedPremiums");
		rowhead.createCell(3).setCellValue("Pass/Fail");
		
		int i=1;
		if ((GlobalVariable.ActAutoPremium != null) && (GlobalVariable.ActAutoPremium.length() > 0)) {
		XSSFRow row = sheet.createRow((short)i);
		row.createCell(0).setCellValue("AutoPremium");
		row.createCell(1).setCellValue(GlobalVariable.ActAutoPremium)
		row.createCell(2).setCellValue(GlobalVariable.ExptAutoPremium)
		row.createCell(3).setCellValue(GlobalVariable.AutoPremiumResult)
		i++;
		}
		
		if ((GlobalVariable.ActPrimaryResidencyPremium != null) && (GlobalVariable.ActPrimaryResidencyPremium.length() > 0)) {
		XSSFRow row2 = sheet.createRow((short)i);
		row2.createCell(0).setCellValue("PrimaryResidencyPremium");
		row2.createCell(1).setCellValue(GlobalVariable.ActPrimaryResidencyPremium)
		row2.createCell(2).setCellValue(GlobalVariable.ExptPrimaryResidencyPremium)
		row2.createCell(3).setCellValue(GlobalVariable.PrimaryResidencyPremiumResult)
		i++;
		}
		
		if ((GlobalVariable.ActSecondaryResidencyPremium != null) && (GlobalVariable.ActSecondaryResidencyPremium.length() > 0)) {
			
		XSSFRow row3 = sheet.createRow((short)i);
		row3.createCell(0).setCellValue("SecondaryResidencyPremium");
		row3.createCell(1).setCellValue(GlobalVariable.ActSecondaryResidencyPremium)
		row3.createCell(2).setCellValue(GlobalVariable.ExptSecondaryResidencyPremium)
		i++;
		}
		
		if ((GlobalVariable.ActUmbrellaPremium != null) && (GlobalVariable.ActUmbrellaPremium.length() > 0)) {
			
		XSSFRow row4 = sheet.createRow((short)i);
		row4.createCell(0).setCellValue("UmbrellaPremium");
		row4.createCell(1).setCellValue(GlobalVariable.ActUmbrellaPremium)
		row4.createCell(2).setCellValue(GlobalVariable.ExptUmbrellaPremium)
		row4.createCell(3).setCellValue(GlobalVariable.UmbrellaPremiumResult)
		i++;
		}
		
		XSSFRow row5 = sheet.createRow((short)i);
		row5.createCell(0).setCellValue("TotalPremium");
		row5.createCell(1).setCellValue(GlobalVariable.ActTotalPolicyPremium)
		row5.createCell(2).setCellValue(GlobalVariable.ExptTotalPolicyPremium)
		row5.createCell(3).setCellValue(GlobalVariable.TotalPremiumResult)
		  
		
		
		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		 
		fileOut.close();
		  
		workbook.close();
		
		println("Excel file has been generated successfully.");
		
		
	}
}