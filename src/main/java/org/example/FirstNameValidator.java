package org.example;

public class FirstNameValidator{
    public static boolean isValidFirstName(String firstName){
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }
}
