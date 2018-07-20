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


suiteProperties.put('id', 'Test Suites/Test Suite-Borrower Submit Loan Application (Invite Borrower)')

suiteProperties.put('name', 'Test Suite-Borrower Submit Loan Application (Invite Borrower)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\1_Roostify\\Automation\\Roo_Core\\Reports\\Test Suite-Borrower Submit Loan Application (Invite Borrower)\\20180720_151226\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Suite-Borrower Submit Loan Application (Invite Borrower)', suiteProperties, [new TestCaseBinding('Test Cases/Loan Submission/Borrower Submit Loan Application (Invite Borrower)', 'Test Cases/Loan Submission/Borrower Submit Loan Application (Invite Borrower)',  null)])
