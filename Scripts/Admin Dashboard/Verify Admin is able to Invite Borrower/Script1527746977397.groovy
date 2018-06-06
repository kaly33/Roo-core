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
//WebUI.callTestCase(findTestCase('Common/Sign In'), [('email') : GlobalVariable.AdminEmail, ('password') : GlobalVariable.Password], FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'com.common.util.LoginHelper.LoginWithAdmin'()

WebUI.waitForElementClickable(findTestObject('Admin Dashboard/Invite Borrower/tab_Invite Borrower'), 10)

WebUI.click(findTestObject('Admin Dashboard/Invite Borrower/tab_Invite Borrower'))

WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Invite Borrower/input_User Email'), 10)

WebUI.setText(findTestObject('Admin Dashboard/Invite Borrower/input_User Email'), GlobalVariable.BorrowerEmail2)

WebUI.click(findTestObject('Admin Dashboard/Invite Borrower/button_Invite'))

WebUI.callTestCase(findTestCase('Common/Gmail Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Common/Page_Gmail/Search input box'), 10)

WebUI.setText(findTestObject('Common/Page_Gmail/Search input box'), 'invites you to start a home loan application')

WebUI.click(findTestObject('Common/Page_Gmail/Search icon'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Common/Page_Gmail/Mail'), 10)

WebUI.click(findTestObject('Common/Page_Gmail/Mail'))

WebUI.click(findTestObject('Common/Page_Gmail/Start Application'))

WebUI.switchToWindowIndex(1)

WebUI.refresh()

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Common/Sign Up'), [('email') : GlobalVariable.BorrowerEmail2, ('password') : GlobalVariable.Password
        , ('firstName') : GlobalVariable.Borrower1FirstName, ('lastName') : GlobalVariable.Borrower1LastName], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('Loan Submission/Verify Borrower is able to Submit Loan Application'), [:], FailureHandling.STOP_ON_FAILURE)



