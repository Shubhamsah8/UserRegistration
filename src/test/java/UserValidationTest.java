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

        Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
    }

    @Test
    public void testValidLastName(){

        Assert.assertTrue(userValidation.isValidLastName("Shah"));
    }

    @Test
    public void testValidEmail(){

        Assert.assertTrue(userValidation.isValidEmail("shubhamsah086@gmail.com"));
    }

    @Test
    public void testValidMobileNumber(){
        Assert.assertTrue(userValidation.isValidMobileNumber("91 8779817254"));
    }
}
