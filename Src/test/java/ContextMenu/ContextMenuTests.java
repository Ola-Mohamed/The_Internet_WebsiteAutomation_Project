package ContextMenu;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends baseTests {

    @Test
    public void ContextMenuTest(){

        var contextMenu = homePage.clickContextMenuPage();
        contextMenu.ContextClick();
        String Message = contextMenu.getTitle();
        contextMenu.acceptOk();
        assertEquals(Message,"You selected a context menu");



    }
}
