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
}
