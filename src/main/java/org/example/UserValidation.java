package org.example;

public class UserValidation {

    //First Use case of valid First name
    public boolean isValidFirstName(String firstName){
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }

    public boolean isValidLastName(String lastName){
        return lastName.matches("[A-Z][a-z]{2,}");
    }

    public boolean isValidEmail(String email){
        return email.matches("[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}");
    }

    public static boolean isValidMobileNumber(String mobileNumber){
        return mobileNumber.matches("91 \\d{10}");
    }
}