import org.example.UserValidation;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Test class for the UserValidation class, covering various validation scenarios.
 */
public class UserValidationTest {

    // Instance of UserValidation for testing
    UserValidation userValidation = new UserValidation();

    /**
     * Test case for validating a valid first name.
     */
    @Test
    public void testValidFirstName() {
        try {
            // Assert that the first name "Shubham" is considered valid
            Assert.assertTrue(userValidation.isValidFirstName("Shubham"));
        } catch (UserValidation.InvalidUserException e) {
            // Throw a RuntimeException if an unexpected exception occurs during the test
            throw new RuntimeException(e);
        }
    }

    /**
     * Test case for validating a valid last name.
     */
    @Test
    public void testValidLastName() {
        try {
            // Assert that the last name "Shah" is considered valid
            Assert.assertTrue(userValidation.isValidLastName("Shah"));
        } catch (UserValidation.InvalidUserException e) {
            // Throw a RuntimeException if an unexpected exception occurs during the test
            throw new RuntimeException(e);
        }
    }

    /**
     * Test case for validating a valid email.
     */
    @Test
    public void testValidEmail() {
        try {
            // Assert that the email "shubhamsah086@gmail.com" is considered valid
            Assert.assertTrue(userValidation.isValidEmail("shubhamsah086@gmail.com"));
        } catch (UserValidation.InvalidUserException e) {
            // Throw a RuntimeException if an unexpected exception occurs during the test
            throw new RuntimeException(e);
        }
    }

    /**
     * Test case for validating a valid mobile number.
     */
    @Test
    public void testValidMobileNumber() {
        try {
            // Assert that the mobile number "91 8779817254" is considered valid
            Assert.assertTrue(userValidation.isValidMobileNumber("91 8779817254"));
        } catch (UserValidation.InvalidUserException e) {
            // Throw a RuntimeException if an unexpected exception occurs during the test
            throw new RuntimeException(e);
        }
    }

    /**
     * Test case for validating a valid password.
     */
    @Test
    public void testValidPassword() {
        try {
            // Assert that the password "SHubhamsha123#" is considered valid
            Assert.assertTrue(userValidation.isValidPassword("SHubhamsha123&"));
        } catch (UserValidation.InvalidUserException e) {
            // Throw a RuntimeException if an unexpected exception occurs during the test
            throw new RuntimeException(e);
        }
    }
}
