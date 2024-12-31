package ForgetPassword;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class forgetPasswordTests extends baseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgetPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!","Message is incorrect");

    }

}
