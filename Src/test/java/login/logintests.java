package login;

import Base.baseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.secureAreaPage;

import static org.testng.Assert.*;

public class logintests extends baseTests {

    @Test
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        secureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");


    }

}
