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

/*Invite Borrower*/
WebUI.callTestCase(findTestCase('Sign In'), ['email':GlobalVariable.BorrowerEmail1,'password':GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)

System.out.println('Value of BorrowerEmail1= ' + GlobalVariable.BorrowerEmail1)

WebUI.waitForElementClickable(findTestObject('Admin Dashboard/Invite Borrower/img'), 10)

WebUI.click(findTestObject('Admin Dashboard/Invite Borrower/img'))

WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Invite Borrower/input_useremail'), 10)

WebUI.setText(findTestObject('Admin Dashboard/Invite Borrower/input_useremail'), GlobalVariable.BorrowerEmail1)

WebUI.click(findTestObject('Admin Dashboard/Invite Borrower/input_commit'))

WebUI.verifyElementPresent(findTestObject('Admin Dashboard/Invite Borrower/Invite email sent'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('gmail.com')

WebUI.setText(findTestObject('Admin Dashboard/Page_Gmail/input_email'), GlobalVariable.GmailEmail)

WebUI.click(findTestObject('Admin Dashboard/Page_Gmail/Next button'))

WebUI.verifyElementPresent(findTestObject('Admin Dashboard/Page_Gmail/input_password'), 10)

WebUI.setText(findTestObject('Admin Dashboard/Page_Gmail/input_password'), GlobalVariable.GmailPassword)

WebUI.click(findTestObject('Admin Dashboard/Page_Gmail/Next button'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Admin Dashboard/Page_Gmail/Search input box'), 'invites you to start a home loan application')

WebUI.click(findTestObject('Admin Dashboard/Page_Gmail/Search icon'))

WebUI.waitForElementPresent(findTestObject('Admin Dashboard/Page_Gmail/Mail'), 10)

WebUI.click(findTestObject('Admin Dashboard/Page_Gmail/Mail'))

WebUI.click(findTestObject('Admin Dashboard/Page_Gmail/Start Application'))



