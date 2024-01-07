package org.example;
import java.util.stream.*;

/**
 * This class performs user validation for various fields such as first name, last name, email, mobile number, and password.
 */
public class UserValidation {
    /**
     * Custom exception class for representing invalid user scenarios.
     */
    public class InvalidUserException extends Exception {
        InvalidUserException(String s) {
            super(s);
        }
    }

    /**
     * Validates the provided first name.
     *
     * @param firstName the first name to be validated
     * @return true if the first name is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the first name is invalid
     */
    public boolean isValidFirstName(String firstName) throws InvalidUserException {
        return validateField(firstName, "[A-Z]{1}[a-z]{2,}", "Invalid First Name");
    }

    /**
     * Validates the provided last name.
     *
     * @param lastName the last name to be validated
     * @return true if the last name is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the last name is invalid
     */
    public boolean isValidLastName(String lastName) throws InvalidUserException {
        return validateField(lastName, "[A-Z][a-z]{2,}", "Invalid Last Name");
    }

    /**
     * Validates the provided email.
     *
     * @param email the email to be validated
     * @return true if the email is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the email is invalid
     */
    public boolean isValidEmail(String email) throws InvalidUserException {
        return validateField(email, "[a-zA-Z0-9./%]+@[A-Za-z]+\\.[a-zA-Z]{2,}", "Invalid Email");
    }

    /**
     * Validates the provided mobile number.
     *
     * @param mobileNumber the mobile number to be validated
     * @return true if the mobile number is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the mobile number is invalid
     */
    public boolean isValidMobileNumber(String mobileNumber) throws InvalidUserException {
        return validateField(mobileNumber, "91 \\d{10}", "Invalid Mobile Number");
    }

    /**
     * Validates the provided password.
     *
     * @param password the password to be validated
     * @return true if the password is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the password is invalid
     */
    public boolean isValidPassword(String password) throws InvalidUserException {
        return validatePassword(password);
    }

    /**
     * Helper method for validating a field using a regular expression.
     *
     * @param value       the value of the field to be validated
     * @param regex       the regular expression pattern for validation
     * @param errorMessage the error message to be thrown if validation fails
     * @return true if the field is valid, otherwise throws an InvalidUserException with the provided error message
     * @throws InvalidUserException if the field is invalid
     */
    private boolean validateField(String value, String regex, String errorMessage) throws InvalidUserException {
        return value.matches(regex) || throwError(errorMessage);
    }

    /**
     * Helper method for validating the password using lambda expressions and streams.
     *
     * @param password the password to be validated
     * @return true if the password is valid, otherwise throws an InvalidUserException with an error message
     * @throws InvalidUserException if the password is invalid
     */
    private boolean validatePassword(String password) throws InvalidUserException {
        // Ensure the password length is at least 8 characters
        if (password.length() < 8) {
            throw new InvalidUserException("Invalid Password: Password should be at least 8 characters long");
        }

        // Count the number of uppercase letters, numbers, and special characters
        long uppercaseCount = password.chars().filter(Character::isUpperCase).count();
        long digitCount = password.chars().filter(Character::isDigit).count();
        long specialCharCount = password.chars().filter(ch -> "[!@#$%&*()_+]".indexOf(ch) != -1).count();

        // Ensure there is at least one uppercase letter, at least one number, and exactly one special character
        if (uppercaseCount < 1 || digitCount < 1 || specialCharCount != 1) {
            throw new InvalidUserException("Invalid Password: Password should be at least 8 characters long, contain at least one uppercase letter, at least one number, and exactly one special character");
        }

        return true;
    }


    /**
     * Helper method for throwing an exception with a specific error message.
     *
     * @param errorMessage the error message for the exception
     * @return this method always throws an InvalidUserException with the provided error message
     * @throws InvalidUserException always thrown with the provided error message
     */
    private boolean throwError(String errorMessage) throws InvalidUserException {
        throw new InvalidUserException(errorMessage);
    }
}
