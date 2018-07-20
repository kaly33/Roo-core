import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\kalyanik\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Loan Submission\\Lender Submit Loan Application on behalf of Borrower\\20180718_115355\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('Admin Dashboard/Verify Admin is able to Create Loan Manually'), 
    [('Email') : GlobalVariable.BorrowerEmail3, ('FirstName') : GlobalVariable.Borrower3FirstName, ('LastName') : GlobalVariable.Borrower3LastName], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.refresh()

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.waitForElementClickable(findTestObject('Admin Dashboard/icon-ContinueOnBehalfOfBorrower'), 
    3)

not_run: WebUI.click(findTestObject('Admin Dashboard/icon-ContinueOnBehalfOfBorrower'))

/*Borrower Details*/
//WebUI.callTestCase(findTestCase('Loan Pages/Borrower Details'), [:], FailureHandling.STOP_ON_FAILURE)
/*Loan Details*/
not_run: WebUI.callTestCase(findTestCase('Loan Pages/Loan Details'), [:], FailureHandling.STOP_ON_FAILURE)

/*Employment Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Employment Details'), [:], FailureHandling.STOP_ON_FAILURE)

/*Assets n Liabilities*/
WebUI.callTestCase(findTestCase('Loan Pages/Assets n Liabilities'), [:], FailureHandling.STOP_ON_FAILURE)

/*Income Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Income Details'), [:], FailureHandling.STOP_ON_FAILURE)

/*Declarations*/
WebUI.callTestCase(findTestCase('Loan Pages/Declarations'), [:], FailureHandling.STOP_ON_FAILURE)

/*Application Release*/
//WebUI.callTestCase(findTestCase('Loan Pages/Application Release'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Loan Pages/Application Release/msg_Loan Submitted'), 
    3)

''', 'Test Cases/Loan Submission/Lender Submit Loan Application on behalf of Borrower', new TestCaseBinding('Test Cases/Loan Submission/Lender Submit Loan Application on behalf of Borrower', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
