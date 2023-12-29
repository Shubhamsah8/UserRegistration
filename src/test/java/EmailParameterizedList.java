import org.example.EmailValidator;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailParameterizedList {
    private String email;

    public EmailParameterizedList(String email){
        this.email = email;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"shubhamsah086@gmail.com"},
                {"devendrasah589@gmail.com"},
                {"hello@gmail.com"}
        });
    }

    @Test
    public void testEmailValidation(){
        Assert.assertTrue(EmailValidator.isValidateEmail(email));
    }

}


