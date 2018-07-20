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


suiteProperties.put('id', 'Test Suites/Test Suite-All')

suiteProperties.put('name', 'Test Suite-All')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\1_Roostify\\Automation\\Roo_Core\\Reports\\Test Suite-All\\20180720_120110\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Suite-All', suiteProperties, [new TestCaseBinding('Test Cases/Loan Submission/Borrower Submit Loan Application (Admin Invite)', 'Test Cases/Loan Submission/Borrower Submit Loan Application (Admin Invite)',  null), new TestCaseBinding('Test Cases/Loan Submission/Borrower Submit Loan Application (Referral URL)', 'Test Cases/Loan Submission/Borrower Submit Loan Application (Referral URL)',  null), new TestCaseBinding('Test Cases/Loan Submission/Lender Submit Loan Application on behalf of Borrower', 'Test Cases/Loan Submission/Lender Submit Loan Application on behalf of Borrower',  null)])
