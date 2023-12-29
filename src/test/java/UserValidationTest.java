import org.example.UserValidation;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
public class UserValidationTest {

    UserValidation userValidation = new UserValidation();
    @Test
    public void testValidFirstName(){
        try {
            Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidLastName(){

        try {
            Assert.assertTrue(userValidation.isValidLastName("Shah"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidEmail(){

        try {
            Assert.assertTrue(userValidation.isValidEmail("shubhamsah086@gmail.com"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidMobileNumber(){
        try {
            Assert.assertTrue(userValidation.isValidMobileNumber("91 8779817254"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testValidPassword(){
        try {
            Assert.assertTrue(userValidation.isValidPassword("SHubhamsha123#"));
        } catch (UserValidation.InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }
}
