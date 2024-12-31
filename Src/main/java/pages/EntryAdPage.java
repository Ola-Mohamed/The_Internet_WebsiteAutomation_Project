package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {

    WebDriver driver;
    private By closeButton = By.cssSelector(".modal-footer > p");


    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }

    public void WaitForModelAppear(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
    }

    public void CloseTheModel(){
        driver.findElement(closeButton).click();
    }
}
