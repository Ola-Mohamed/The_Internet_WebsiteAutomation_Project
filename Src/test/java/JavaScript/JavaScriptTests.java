package JavaScript;

import Base.baseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends baseTests {

    @Test

    public void testScrollToTable(){
        homePage.clickDeepDom().scrollToTable();
    }
    @Test
    public void testInfiniteScroll(){
     homePage.clickInfiniteScroll().scrollToParagraph(6);
    }

}
