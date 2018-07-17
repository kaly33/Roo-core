package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object GmailEmail
     
    /**
     * <p></p>
     */
    public static Object GmailPassword
     
    /**
     * <p></p>
     */
    public static Object AdminEmail
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object AdminFirstName
     
    /**
     * <p></p>
     */
    public static Object AdminLastName
     
    /**
     * <p></p>
     */
    public static Object BaseURL
     
    /**
     * <p></p>
     */
    public static Object BorrowerEmail1
     
    /**
     * <p></p>
     */
    public static Object BorrowerEmail2
     
    /**
     * <p></p>
     */
    public static Object BorrowerEmail3
     
    /**
     * <p></p>
     */
    public static Object Borrower1FirstName
     
    /**
     * <p></p>
     */
    public static Object Borrower1LastName
     
    /**
     * <p></p>
     */
    public static Object Borrower2FirstName
     
    /**
     * <p></p>
     */
    public static Object Borrower2LastName
     
    /**
     * <p></p>
     */
    public static Object Borrower3FirstName
     
    /**
     * <p></p>
     */
    public static Object Borrower3LastName
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['GmailEmail' : 'kkachhi@roostify.com', 'GmailPassword' : 'kaly@33333'])
        allVariables.put('Dev environment', allVariables['default'] + ['AdminEmail' : 'kkachhi+admin1@roostify.com', 'Password' : 'gmail pwd', 'AdminFirstName' : 'Kalyani', 'AdminLastName' : 'Admin', 'BaseURL' : 'https://dev.roostify.com', 'BorrowerEmail1' : 'kkachhi+test1@roostify.com', 'BorrowerEmail2' : 'kkachhi+test1@roostify.com', 'BorrowerEmail3' : 'kkachhi+test3@roostify.com', 'Borrower1FirstName' : 'Kaly1', 'Borrower1LastName' : 'Kachhi'])
        allVariables.put('QA environment', allVariables['default'] + ['AdminEmail' : 'kkachhi+admin@roostify.com', 'GmailEmail' : 'kkachhi@roostify.com', 'Password' : 'gmail pwd', 'GmailPassword' : 'kaly@33333', 'AdminFirstName' : 'Kalyani', 'AdminLastName' : 'Admin', 'BaseURL' : 'https://roostify-blueprint-dev.herokuapp.com/users/sign_in?a=blueprintdev', 'BorrowerEmail1' : 'kkachhi+test1@roostify.com', 'BorrowerEmail2' : 'kkachhi+test10@roostify.com', 'BorrowerEmail3' : 'kkachhi+test3@roostify.com', 'Borrower1FirstName' : 'Kaly1', 'Borrower1LastName' : 'Kachhi', 'Borrower2FirstName' : 'Kaly2', 'Borrower2LastName' : 'Kachhi', 'Borrower3FirstName' : 'Kaly3', 'Borrower3LastName' : 'Kachhi'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        GmailEmail = selectedVariables['GmailEmail']
        GmailPassword = selectedVariables['GmailPassword']
        AdminEmail = selectedVariables['AdminEmail']
        Password = selectedVariables['Password']
        AdminFirstName = selectedVariables['AdminFirstName']
        AdminLastName = selectedVariables['AdminLastName']
        BaseURL = selectedVariables['BaseURL']
        BorrowerEmail1 = selectedVariables['BorrowerEmail1']
        BorrowerEmail2 = selectedVariables['BorrowerEmail2']
        BorrowerEmail3 = selectedVariables['BorrowerEmail3']
        Borrower1FirstName = selectedVariables['Borrower1FirstName']
        Borrower1LastName = selectedVariables['Borrower1LastName']
        Borrower2FirstName = selectedVariables['Borrower2FirstName']
        Borrower2LastName = selectedVariables['Borrower2LastName']
        Borrower3FirstName = selectedVariables['Borrower3FirstName']
        Borrower3LastName = selectedVariables['Borrower3LastName']
        
    }
}
