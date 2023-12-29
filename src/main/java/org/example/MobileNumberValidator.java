package org.example;

public class MobileNumberValidator{
    public static boolean isValidateMobileNumber(String mobileNumber){
        return mobileNumber.matches("91 \\d{10}");
    }
}
