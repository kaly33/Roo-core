
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.common.util.LoginHelper.loginWith"(
    	String email	
     , 	String password	
     , 	String fname	
     , 	String lname	) {
    (new com.common.util.LoginHelper()).loginWith(
        	email
         , 	password
         , 	fname
         , 	lname)
}

def static "com.common.util.LoginHelper.LoginWithAdmin"() {
    (new com.common.util.LoginHelper()).LoginWithAdmin()
}
