package EntryAd;

import Base.baseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends baseTests {

    @Test
    public void testModel(){
        var EntryAd = homePage.clickEntryAdPage();
        EntryAd.WaitForModelAppear();
        EntryAd.CloseTheModel();


    }
}
