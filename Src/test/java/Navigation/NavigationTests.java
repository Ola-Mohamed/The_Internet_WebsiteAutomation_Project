package Navigation;

import Base.baseTests;
import org.testng.annotations.Test;

public class NavigationTests extends baseTests {

    @Test

    public void NavigationTest() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowsManager().goBack();
        getWindowsManager().refreshPage();
        getWindowsManager().goForward();
        getWindowsManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowsManager().switchToTab("New Window");
    }
}
