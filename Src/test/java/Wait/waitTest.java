package Wait;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTest extends baseTests {

    @Test
    public void testEx1DynamicLoading(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
