package org.example;

public class PasswordValidator{
    public static boolean isValidatePassword(String password){
        return password.length() >=8 &&
                password.matches(".*[A-Z]*.") &&
                password.matches(".*[//d]*.") &&
                password.matches(".*[!@#$%^&*()_+]*.");
    }
}
