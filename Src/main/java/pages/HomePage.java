package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){

        clickLink("Form Authentication");

        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){

        clickLink(("Dropdown"));
        return new DropDownPage(driver);
    }
    public ForgetPasswordPage clickForgetPassword(){

        clickLink(("Forgot Password"));
        return new ForgetPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploaded clickFileUpload(){
        clickLink("File Upload");
        return new FileUploaded(driver);
    }
    public EntryAdPage clickEntryAdPage(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);

    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);

    }
    public DeepDomPage clickDeepDom(){
        clickLink("Large & Deep DOM");
        return new DeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
