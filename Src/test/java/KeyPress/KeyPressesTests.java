package KeyPress;

import Base.baseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends baseTests {

    @Test
    public void testBackSpace(){
        var key = homePage.clickKeyPresses();
         key.enterText("A" + Keys.BACK_SPACE);
         assertEquals(key.getResult(), "You entered: BACK_SPACE");

    }

    @Test
    public void testPi() {
            var key = homePage.clickKeyPresses();
            key.enterPi(); // Now directly enters "3.14"
        }


}
