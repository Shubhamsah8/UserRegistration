import org.example.UserValidation;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

/**
 * Parameterized test class for email validation using JUnit's Parameterized runner.
 */
@RunWith(Parameterized.class)
public class EmailParameterizedList {
    private String email;

    /**
     * Constructor for the EmailParameterizedList class.
     *
     * @param email the email to be tested
     */
    public EmailParameterizedList(String email) {
        this.email = email;
    }

    /**
     * Provides a list of email addresses as parameters for the parameterized test.
     *
     * @return a list of Object arrays containing email addresses
     */
    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"shubhamsah086@gmail.com"},
                {"devendrasah589@gmail.com"},
                {"hello@gmail.com"}
        });
    }

    // Instance of UserValidation for testing
    UserValidation userValidation = new UserValidation();

    /**
     * Parameterized test case for validating email addresses.
     *
     * @throws UserValidation.InvalidUserException if the email validation fails
     */
    @Test
    public void testEmailValidation() throws UserValidation.InvalidUserException {
        // Assert that the email address is considered valid
        Assert.assertTrue(userValidation.isValidEmail(email));
    }
}
