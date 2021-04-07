package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    // Fields
    private WebDriver driver;
    private By loc_page_banner = By.xpath("//h1");
    private By loc_email_input = By.id("user");
    private By loc_pass_input = By.id("password");
    private By loc_login_bttn = By.id("login");

    // Constructor (webdriver instance injected)
    public LoginPage(WebDriver inputDriver){
        driver = inputDriver;

    }

    // Methods (represents actual user actions in the page)
    public boolean isLoginPageVisible(){
        WebElement logInText = driver.findElement(loc_page_banner);
        return logInText.isDisplayed();

    }
    public void login(String email, String password){
        WebElement emailInput = driver.findElement(loc_email_input);
        emailInput.sendKeys(email);

        WebElement inputPass = driver.findElement(loc_pass_input);
        inputPass.sendKeys(password);

        WebElement loginBttn = driver.findElement(loc_login_bttn);
        loginBttn.click();
        //1. enter email
        //2. enter password
        //3. click "log in" button
    }
}
