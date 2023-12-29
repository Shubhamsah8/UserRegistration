package org.example;

public class EmailValidator{
    public static boolean isValidateEmail(String email){
        return email.matches("[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}");
    }
}
