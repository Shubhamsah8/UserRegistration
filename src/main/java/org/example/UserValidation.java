package org.example;

public class UserValidation {

    //First Use case of valid First name
    public boolean isValidFirstName(String firstName){
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }


}