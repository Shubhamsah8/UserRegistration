package org.example;


public class UserValidation {
    public class InvalidUserException extends Exception{
        InvalidUserException(String s){
            super(s);
        }
    }

    //First Use case of valid First name
    public boolean isValidFirstName(String firstName) throws InvalidUserException{
        if(firstName.matches("[A-Z]{1}[a-z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid First Name");
        }
    }

    public boolean isValidLastName(String lastName) throws InvalidUserException{
        if(lastName.matches("[A-Z][a-z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Last Name");
        }
    }

    public boolean isValidEmail(String email) throws InvalidUserException{
        if(email.matches("[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Email");
        }
    }

    public boolean isValidMobileNumber(String mobileNumber) throws InvalidUserException{
        if(mobileNumber.matches("91 \\d{10}")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Mobile Number");
        }
    }

    public boolean isValidPassword(String password) throws InvalidUserException{
        if(password.length() >=8 &&
                password.matches(".*[A-Z]*.") &&
                password.matches(".*[//d{10}]*.") &&
                password.matches(".*[!@#$%&*()_+]*.")){
            return true;
        }
        else{
            throw new InvalidUserException("Invalid Password");
        }

    }
}