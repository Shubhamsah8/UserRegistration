import org.example.UserValidation;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

/*
    @description: This class contains test cases for user validation.
*/
public class UserValidationTest {

    /*
        @description: Tests the validation of a valid first name.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidFirstName(){
        UserValidation userValidation = new UserValidation();

        /*
            @description: Validates a first name "Shubham".
            @parameters:
                - "Shubham": The first name to be validated.
            @return: Expects the validation result to be true.
        */
        Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
    }

    /*
        @description: Tests the validation of a valid last name.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidLastName(){
        UserValidation userValidation = new UserValidation();

        /*
            @description: Validates a last name "Shah".
            @parameters:
                - "Shah": The last name to be validated.
            @return: Expects the validation result to be true.
        */
        Assert.assertTrue(userValidation.isValidLastName("Shah"));
    }

    /*
        @description: Tests the validation of a valid email address.
        @parameters: None
        @return: None
    */
    @Test
    public void testValidEmail(){
        UserValidation userValidation = new UserValidation();

        /*
            @description: Validates an email address "shubhamsah086@gmail.com".
            @parameters:
                - "shubhamsah086@gmail.com": The email address to be validated.
            @return: Expects the validation result to be true.
        */
        Assert.assertTrue(userValidation.isValidEmail("shubhamsah086@gmail.com"));
    }
}
