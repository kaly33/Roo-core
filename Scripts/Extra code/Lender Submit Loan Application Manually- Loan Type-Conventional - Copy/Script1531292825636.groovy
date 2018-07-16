import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Admin Dashboard/Verify Admin is able to Create Loan Manually'), 
    [('Email') : GlobalVariable.BorrowerEmail3, ('FirstName') : GlobalVariable.Borrower3FirstName
        , ('LastName') : GlobalVariable.Borrower3LastName], FailureHandling.STOP_ON_FAILURE)

//Employment Details

WebUI.click(findTestObject('Loan Pages/Employment Details/a_Employment'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Loan Pages/Employment Details/input_loan_application_b_recen'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ'), 
    'Google')

WebUI.click(findTestObject('Loan Pages/Employment Details/button_No'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_No_1'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Salary'))

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_MonthJanuaryFebruaryMar'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_Year2018201720162015201'), 
    '2007', true)

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Yes'))

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_1 (1)'), 
    'Engineer')

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_2 (1)'), 
    'NY')

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_AKALAZARCACOCTDEDCFLGAH'), 
    'NY', true)

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_3 (1)'), 
    '4567')

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Fix later and continue'))


//Assets & Liabilities


WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/input_loan_application_b_curre'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Loan Pages/Employment Details/input_loan_application_b_recen_1'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_assets'), 
    'Admac')

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_Savings AccountChecking'), 
    'mutual_fund', true)

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/input_loan_application_b_ongoi'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Continue'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))


//Income Details


WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'))

WebUI.setText((findTestObject('Loan Pages/Income Details/input_loan_applicationb_employ')),'55500')

WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'))

WebUI.setText((findTestObject('Loan Pages/Income Details/input_loan_applicationb_income')),'5555')

WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Income Details/button_Continue'))



