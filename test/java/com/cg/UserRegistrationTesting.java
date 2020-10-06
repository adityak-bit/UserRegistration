package com.cg;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTesting {
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("Aditya");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("aditya");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.lastNameValidator("Kumar");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.lastNameValidator("kumar");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenEmail_Proper_ReturnTruee() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.emailValidator("abc.xyz@bridgelabz.co.in");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenEmail_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.emailValidator("abc.co.in");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.passwordValidator("Aditya@765");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.passwordValidator("asfgsgfd");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.mobileNoValidator("91 1234567890");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        user.firstNameValidator("12345");
	        Assert.assertFalse(false);
	    }
}
