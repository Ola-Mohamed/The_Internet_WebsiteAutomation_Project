package Alerts;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends baseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully  clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        var text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
       String  text = "Ola";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
