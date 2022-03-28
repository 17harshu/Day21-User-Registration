package com.Day21UserRegistration;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Userregistration {
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
    private static final String PHONE_PATTERN = "^[9]{1}[1]{1}[ ]?[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,fname);
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,lName);
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matches(EMAIL_PATTERN,email);
    }

    public boolean validatePhoneNumber(String phNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return pattern.matches(PHONE_PATTERN,phNumber);
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matches(PASSWORD_PATTERN,password);
    }
    ArrayList<String> emailArrayList = new ArrayList<>();
    public void addEmail(){
        emailArrayList.add("abc@yahoo.com");
        emailArrayList.add("abc-100@yahoo.com");
        emailArrayList.add("abc111@abc.com");
        emailArrayList.add("abc-100@abc.net");
        emailArrayList.add("abc.100@abc.com.au");
        emailArrayList.add("abc@1.com");
        emailArrayList.add("abc@gmail.com.com");
        emailArrayList.add("abc@abc+100@gmail.com");
    }
    
  //Function for Checking Mood id HAPPY OR SAD
  	public String moodAnalyse(String fName, String Lname, String EmailId, String MobileNo, String Password) {
  		if (validateFirstName(fName) == true && validateLastName(Lname) == true && validateEmail(EmailId) == true
  				&& validatePhoneNumber(MobileNo) == true && validatePassword(Password)) {
  			return "HAPPY";
  		} else {
  			return "SAD";
  		}

  	}
}
