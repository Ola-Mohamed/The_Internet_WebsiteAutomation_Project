package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("button[title='Decrease indent']");


    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextFromArea(){
        switchToEditorArea();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }

    public void setTextArea(String text){
        switchToEditorArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }

    public String getTextArea(){
        switchToEditorArea();
        String text = driver.findElement(textArea).getText();
        switchToMainFrame();
        return text;
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditorArea(){
        driver.switchTo().frame(editorIframeId);
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }



















}
