package org.example;

/*
    @description: This class handles user validation operations.
*/
public class UserValidation {

    /*
        @description: Validates the first name according to specified criteria.
        @parameters:
            - firstName: The first name to be validated.
        @return: Returns true if the first name is valid, false otherwise.
    */
    public boolean isValidFirstName(String firstName){
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }

    /*
        @description: Validates the last name according to specified criteria.
        @parameters:
            - lastName: The last name to be validated.
        @return: Returns true if the last name is valid, false otherwise.
    */
    public boolean isValidLastName(String lastName){
        return lastName.matches("[A-Z][a-z]{2,}");
    }

    /*
        @description: Validates an email address according to specified criteria.
        @parameters:
            - email: The email address to be validated.
        @return: Returns true if the email address is valid, false otherwise.
    */
    public boolean isValidEmail(String email){
        return email.matches("[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}");
    }

    /*
        @description: Validates a mobile number according to specified criteria.
        @parameters:
            - mobileNumber: The mobile number to be validated.
        @return: Returns true if the mobile number is valid, false otherwise.
    */
    public static boolean isValidMobileNumber(String mobileNumber){
        return mobileNumber.matches("91 \\d{10}");
    }

    /*
        @description: Validates a password according to specified criteria.
        @parameters:
            - password: The password to be validated.
        @return: Returns true if the password is valid, false otherwise.
    */
    public static boolean isValidPassword(String password){
        return password.length() >= 8 &&
                password.matches(".*[A-Z]*.");
    }
}
