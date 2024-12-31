package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    WebDriver driver;
    private By box = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ContextClick() {
        WebElement contextBox = driver.findElement(box);

        Actions actions = new Actions(driver);
        actions.contextClick(contextBox).perform();
    }

    public String getTitle() {
        String alertText = driver.switchTo().alert().getText();

        return alertText;
    }

    public void  acceptOk(){
        driver.switchTo().alert().accept();
    }

}
