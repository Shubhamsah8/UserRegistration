import org.example.UserValidation;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
public class UserValidationTest {

    @Test
    public void testValidFirstName(){
        UserValidation userValidation = new UserValidation();

        Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
    }
}
