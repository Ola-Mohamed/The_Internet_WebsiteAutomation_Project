package Alerts;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadedTests extends baseTests {


    @Test
    public void testUploadedFile(){

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFiles("/Users/angie/workspace/testautomationu/webdriver_java/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }

}
