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
    public static Object AdminEmail
     
    /**
     * <p></p>
     */
    public static Object GmailEmail
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object GmailPassword
     
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
    public static Object FirstName
     
    /**
     * <p></p>
     */
    public static Object LastName
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['AdminEmail' : 'kkachhi+admin@roostify.com', 'GmailEmail' : 'kkachhi@roostify.com', 'Password' : 'Kal@3333', 'GmailPassword' : 'kaly@33333'])
        allVariables.put('Global Variables', allVariables['default'] + ['BorrowerEmail1' : 'kkachhi+test11@roostify.com', 'BorrowerEmail2' : 'kkachhi+test12@roostify.com', 'BorrowerEmail3' : 'kkachhi+test13@roostify.com', 'FirstName' : 'Kaly', 'LastName' : 'Kachhi'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        AdminEmail = selectedVariables['AdminEmail']
        GmailEmail = selectedVariables['GmailEmail']
        Password = selectedVariables['Password']
        GmailPassword = selectedVariables['GmailPassword']
        BorrowerEmail1 = selectedVariables['BorrowerEmail1']
        BorrowerEmail2 = selectedVariables['BorrowerEmail2']
        BorrowerEmail3 = selectedVariables['BorrowerEmail3']
        FirstName = selectedVariables['FirstName']
        LastName = selectedVariables['LastName']
        
    }
}
