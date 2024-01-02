import org.example.EmailValidator;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

/*
    @description: This class contains parameterized tests for email validation.
*/
@RunWith(Parameterized.class)
public class EmailParameterizedList {
    private String email;

    /*
        @description: Constructor to initialize the email parameter.
        @parameters:
            - email: The email address to be tested.
    */
    public EmailParameterizedList(String email){
        this.email = email;
    }

    /*
        @description: Provides a list of email addresses for parameterized testing.
        @parameters: None
        @return: Returns a list of email addresses as test data.
    */
    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"shubhamsah086@gmail.com"},
                {"devendrasah589@gmail.com"},
                {"hello@gmail.com"}
        });
    }

    /*
        @description: Tests the email validation using parameterized test data.
        @parameters: None
        @return: None
    */
    @Test
    public void testEmailValidation(){
        /*
            @description: Validates the provided email address.
            @parameters: None
            @return: Expects the validation result to be true.
        */
        Assert.assertTrue(EmailValidator.isValidateEmail(email));
    }
}
