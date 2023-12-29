package org.example;

public class LastNameValidator{
    public static boolean isValidLastName(String lastName){
        return lastName.matches("[A-Z][a-z]{2,}");
    }
}
