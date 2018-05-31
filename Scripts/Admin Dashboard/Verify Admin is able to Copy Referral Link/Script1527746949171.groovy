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

/*Copy Referral Link*/
WebUI.callTestCase(findTestCase('Common/Sign In'), [('email') : GlobalVariable.AdminEmail, ('password') : GlobalVariable.Password],    FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/Copy Referral Link Tab'))
WebUI.takeScreenshot()
WebUI.takeScreenshot('D:\\copylinkscreenshot1.png')
string url = WebUI.getText(findTestObject('Object Repository/Admin Dashboard/Copy Referral Link/input_referral_url'))
WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), 100)
WebUI.waitForElementClickable(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), 100)
WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'))
WebUI.closeBrowser()