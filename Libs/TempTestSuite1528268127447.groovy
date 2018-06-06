import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Login Test Suite')

suiteProperties.put('name', 'Login Test Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\1_Roostify\\Automation\\Roo_Core\\Reports\\Login Test Suite\\20180606_122527\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Login Test Suite', suiteProperties, [new TestCaseBinding('Test Cases/Borrower Dashboard/Verify Borrower is able to Login - Iteration 1', 'Test Cases/Borrower Dashboard/Verify Borrower is able to Login',  [ 'varEmail' : 'kkachhi+test1@roostify.com' , 'varPassword' : 'kal@3333' ,  ]), new TestCaseBinding('Test Cases/Borrower Dashboard/Verify Borrower is able to Login - Iteration 2', 'Test Cases/Borrower Dashboard/Verify Borrower is able to Login',  [ 'varEmail' : 'kkachhi+test2@roostify.com' , 'varPassword' : 'kal@3333' ,  ]), new TestCaseBinding('Test Cases/Borrower Dashboard/Verify Borrower is able to Login - Iteration 3', 'Test Cases/Borrower Dashboard/Verify Borrower is able to Login',  [ 'varEmail' : 'kkachhi+test3@roostify.com' , 'varPassword' : 'kal@3333' ,  ]), new TestCaseBinding('Test Cases/Admin Dashboard/Verify Admin is able to Login', 'Test Cases/Admin Dashboard/Verify Admin is able to Login',  null)])
