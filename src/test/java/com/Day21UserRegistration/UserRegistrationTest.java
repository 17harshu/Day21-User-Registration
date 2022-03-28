package com.Day21UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//Test Case for FirstName return true
			@Test
			public void checkingFirstname() {
		        Userregistration userRegistration = new Userregistration();
			boolean isFirstName = userRegistration.validateFirstName("Rekha");
			Assert.assertTrue(isFirstName);
			}
			
			//Test Case for FirstName return False
			@Test
			public void checkingFirstNameInvalidReturnFalse() {
				Userregistration userRegistration = new Userregistration();
			boolean isFirstName = userRegistration.validateFirstName("riya");
			Assert.assertFalse(isFirstName);
			}

			// Test Case for LastName return True
			@Test
			public void checkingLastName() {
				Userregistration userRegistration = new Userregistration();
				boolean isLastName = userRegistration.validateLastName("Jambhulkar");
				Assert.assertTrue(isLastName);
			}

			// Test Case for LastName return False
			@Test
			public void checkingLastNameInvalidMustReturnFalse() {
				Userregistration userRegistration = new Userregistration();
				boolean isLastName = userRegistration.validateLastName("jambhulkar");
				Assert.assertFalse(isLastName);
			}

			// Test Case for EmailId return True
			@Test
			public void checkingEmailId() {
				Userregistration userRegistration = new Userregistration();
				boolean isEmailId = userRegistration.validateEmail("jambhulkarrekha@gmail.com");
				Assert.assertTrue(isEmailId);
			}

			// Test Case for EmailId return False
			@Test
			public void checkingEmailIdInvalidMustReturnFalse() {
				Userregistration userRegistration = new Userregistration();
				boolean isEmailId = userRegistration.validateEmail(".jambhulkarrekha@111");
				Assert.assertFalse(isEmailId);
			}

			// Test Case for MobileNo return True
			@Test
			public void checkingMobileNo() {
		        Userregistration userRegistration = new Userregistration();
				boolean isMobileNo = userRegistration.validatePhoneNumber("91 9138124143");
				Assert.assertTrue(isMobileNo);
			}
			
			// Test Case for MobileNo return False
			@Test
			public void checkingMobileNoInvalidMustReturnFalse() {
		        Userregistration userRegistration = new Userregistration();
				boolean isMobileNo = userRegistration.validatePhoneNumber("656965241");
				Assert.assertFalse(isMobileNo);
			}

			// Test Case for Password return True
			@Test
			public void checkingPassWord() {
				Userregistration userRegistration = new Userregistration();
				boolean isPassWord = userRegistration.validatePassword("Rekha@123");
				Assert.assertTrue(isPassWord);
			}

			// Test Case for Password return False
			@Test
			public void checkingPassWordInvalidMustReturnFalse() {
				Userregistration userRegistration = new Userregistration();
				boolean isPassWord = userRegistration.validatePassword("rek1f");
				Assert.assertFalse(isPassWord);
			}
			
			//Test case for mood analyzer return HAPPY
			@Test
			public void moodAnalyser_Test_Happy() {
				Userregistration userRegistration = new Userregistration();
				String isMoodHappy = userRegistration.moodAnalyse("Rekha", "Jambhulkar", "jambhulkarrekha@gmail.com", "91 9822626490", "Rekha@123" );
				Assert.assertEquals("HAPPY", isMoodHappy);
			}
			
			//Test case for mood analyzer return SAD
			@Test
			public void moodAnalyser_Test_SAD() {
				Userregistration userRegistration = new Userregistration();
				String isMoodSad = userRegistration.moodAnalyse("Rekha", "Jambhulkar", "jambhulkarrekha@gmail.com", "91 9822626490", "Rekha@123" );
				Assert.assertEquals("HAPPY", isMoodSad);
			}
}
