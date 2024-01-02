package org.example;

/*
    @description: This class handles user validation operations and defines a custom exception for invalid users.
*/
public class UserValidation {

    /*
        @description: Custom exception class for representing invalid users.
    */
    public class InvalidUserException extends Exception {
        /*
            @description: Constructor to initialize the exception with a message.
            @parameters:
                - s: The exception message.
        */
        InvalidUserException(String s){
            super(s);
        }
    }

    /*
        @description: Validates the first name according to specified criteria.
        @parameters:
            - firstName: The first name to be validated.
        @return: Returns true if the first name is valid.
        @throws InvalidUserException: Throws an exception if the first name is invalid.
    */
    public boolean isValidFirstName(String firstName) throws InvalidUserException {
        if(firstName.matches("[A-Z]{1}[a-z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid First Name");
        }
    }

    /*
        @description: Validates the last name according to specified criteria.
        @parameters:
            - lastName: The last name to be validated.
        @return: Returns true if the last name is valid.
        @throws InvalidUserException: Throws an exception if the last name is invalid.
    */
    public boolean isValidLastName(String lastName) throws InvalidUserException {
        if(lastName.matches("[A-Z][a-z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Last Name");
        }
    }

    /*
        @description: Validates an email address according to specified criteria.
        @parameters:
            - email: The email address to be validated.
        @return: Returns true if the email address is valid.
        @throws InvalidUserException: Throws an exception if the email address is invalid.
    */
    public boolean isValidEmail(String email) throws InvalidUserException {
        if(email.matches("[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Email");
        }
    }

    /*
        @description: Validates a mobile number according to specified criteria.
        @parameters:
            - mobileNumber: The mobile number to be validated.
        @return: Returns true if the mobile number is valid.
        @throws InvalidUserException: Throws an exception if the mobile number is invalid.
    */
    public boolean isValidMobileNumber(String mobileNumber) throws InvalidUserException {
        if(mobileNumber.matches("91 \\d{10}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Mobile Number");
        }
    }

    /*
        @description: Validates a password according to specified criteria.
        @parameters:
            - password: The password to be validated.
        @return: Returns true if the password is valid.
        @throws InvalidUserException: Throws an exception if the password is invalid.
    */
    public boolean isValidPassword(String password) throws InvalidUserException {
        if(password.length() >= 8 &&
                password.matches(".*[A-Z]*.") &&
                password.matches(".*\\d{1,}.*") &&
                password.matches(".*[!@#$%&*()_+]*.")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Password");
        }
    }
}
