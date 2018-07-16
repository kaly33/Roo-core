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


RunConfiguration.setExecutionSettingFile('C:\\Users\\kalyanik\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Loan Submission\\Borrower Submit Loan Application (Admin Invite)\\20180716_163251\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Admin Dashboard/Verify Admin is able to Invite Borrower'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Gmail Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Common/Page_Gmail/Search input box'), 3)

WebUI.setText(findTestObject('Common/Page_Gmail/Search input box'), 'invites you to start a home loan application')

WebUI.click(findTestObject('Common/Page_Gmail/Search icon'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Common/Page_Gmail/Mail'), 3)

WebUI.click(findTestObject('Common/Page_Gmail/Mail'))

WebUI.click(findTestObject('Common/Page_Gmail/Start Application'))

WebUI.switchToWindowIndex(1)

WebUI.refresh()

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('Common/Sign Up'), [('Email') : GlobalVariable.BorrowerEmail2, ('FirstName') : GlobalVariable.Borrower2FirstName
        , ('LastName') : GlobalVariable.Borrower2LastName, ('Password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.common.util.LoginHelper.loginWith'(GlobalVariable.BorrowerEmail2, GlobalVariable.Password, 
    GlobalVariable.Borrower1FirstName, GlobalVariable.Borrower1LastName)

WebUI.callTestCase(findTestCase('Loan Pages/Borrower Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Loan Pages/Declarations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Loan Pages/Application Release'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Loan Pages/Econsent page'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Loan Submission/Borrower Submit Loan Application (Admin Invite)', new TestCaseBinding('Test Cases/Loan Submission/Borrower Submit Loan Application (Admin Invite)', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
