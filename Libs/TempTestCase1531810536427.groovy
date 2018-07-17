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


RunConfiguration.setExecutionSettingFile('C:\\Users\\kalyanik\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Admin Dashboard\\Verify Admin is able to Copy Referral Link\\20180717_122536\\execution.properties')

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

/*Copy Referral Link*/
//WebUI.callTestCase(findTestCase('Common/Sign In'), [('email') : GlobalVariable.AdminEmail, ('password') : GlobalVariable.Password],    FailureHandling.STOP_ON_FAILURE)
not_run: CustomKeywords.'com.common.util.LoginHelper.LoginWithAdmin'()

not_run: WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/tab_Copy Referral Link'))

not_run: WebUI.takeScreenshot('D:\\\\copylinkscreenshot1.png')

not_run: String url = WebUI.getAttribute(findTestObject('Admin Dashboard/Copy Referral Link/copy_Referral_url'), 
    'Value')

not_run: System.out.println(url)

not_run: WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), 
    3)

not_run: WebUI.takeScreenshot()

not_run: WebUI.waitForElementClickable(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), 
    3)

not_run: WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Sign Out'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(url)

WebUI.waitForPageLoad(2)

''', 'Test Cases/Admin Dashboard/Verify Admin is able to Copy Referral Link', new TestCaseBinding('Test Cases/Admin Dashboard/Verify Admin is able to Copy Referral Link', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
