import org.example.UserValidation;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

/*
    @description: This class contains test cases for user validation, handling custom exceptions.
*/
public class UserValidationTest {

    UserValidation userValidation = new UserValidation();

    /*
        @description: Tests the validation of a valid first name.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidFirstName(){
        try {
            /*
                @description: Validates a first name "Shubham".
                @parameters: None
                @return: Expects the validation result to be true.
            */
            Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        @description: Tests the validation of a valid last name.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidLastName(){
        try {
            /*
                @description: Validates a last name "Shah".
                @parameters: None
                @return: Expects the validation result to be true.
            */
            Assert.assertTrue(userValidation.isValidLastName("Shah"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        @description: Tests the validation of a valid email address.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidEmail(){
        try {
            /*
                @description: Validates an email address "shubhamsah086@gmail.com".
                @parameters: None
                @return: Expects the validation result to be true.
            */
            Assert.assertTrue(userValidation.isValidEmail("shubhamsah086@gmail.com"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        @description: Tests the validation of a valid mobile number.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidMobileNumber(){
        try {
            /*
                @description: Validates a mobile number "91 8779817254".
                @parameters: None
                @return: Expects the validation result to be true.
            */
            Assert.assertTrue(userValidation.isValidMobileNumber("91 8779817254"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        @description: Tests the validation of a valid password.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidPassword(){
        try {
            /*
                @description: Validates a password "SHubhamsha123#".
                @parameters: None
                @return: Expects the validation result to be true.
            */
            Assert.assertTrue(userValidation.isValidPassword("SHubhamsha123#"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }
}
