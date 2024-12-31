package Frames;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WysiwygEditor extends baseTests {

    @Test
    public void TestWysiwygEditor(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextFromArea();

        String Text1 = "Hi ";
        String Text2 = "Automation";

        editorPage.setTextArea(Text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(Text2);

        assertEquals(editorPage.getTextArea(), Text1+Text2, "Text from editor is incorrect");

    }
}
