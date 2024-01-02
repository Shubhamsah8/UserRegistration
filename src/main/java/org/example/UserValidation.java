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
}
