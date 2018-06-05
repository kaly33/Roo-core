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

//WebUI.openBrowser(' https://dev.roostify.com/users/sign_up/?r=kalyaniadmin')
WebUI.waitForPageLoad(10)
WebUI.setText(findTestObject('Common/Sign Up/input_userfirst_name'), firstName)
WebUI.setText(findTestObject('Common/Sign Up/input_userlast_name'), lastName)
WebUI.setText(findTestObject('Common/Sign Up/input_User email'), email)
WebUI.setText(findTestObject('Common/Sign Up/input_userpassword'),password)
WebUI.click(findTestObject('Common/Sign Up/input_TermsnConditions_check'))
WebUI.click(findTestObject('Common/Sign Up/button_Start Application'))
String dashboardName= WebUI.getText(findTestObject('Common/Sign In/text_Dashboard Name'))
String fullName=WebUI.concatenate([firstName,' ',lastName] as String[], FailureHandling.STOP_ON_FAILURE)
WebUI.verifyMatch(dashboardName, fullName, true)
	




