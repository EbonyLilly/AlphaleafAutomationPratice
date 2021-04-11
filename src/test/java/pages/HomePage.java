package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    // ----Fields: Data or list of element locations
    private WebDriver driver;
    private String url = "https://trello.com";
    private By loc_banner_text = By.xpath("//h1");
    private By loc_login_link = By.linkText("Log in");
    private By loc_signup_link = By.linkText("Sign up");
    private By loc_pricing_link = By.xpath("//a[text()='Pricing']");
    private By loc_apps_link = By.xpath("//a[text()='Apps']");
    private By loc_about_link = By.linkText("About");
    private By loc_automation_link = By.linkText("Automation");



    // Constructor
    public HomePage(WebDriver inputDriver) {
        driver = inputDriver;
    }


    // ----Methods: users action in this page
    public void open() {
        driver.get(url);
    }

    public boolean isPageVisible() {
        WebElement bannerText = driver.findElement(loc_banner_text);
        return bannerText.isDisplayed();
    }

    public void gotoLoginPAge() {
        WebElement loginLink = driver.findElement(loc_login_link);
        loginLink.click();
    }

    public void gotoSignUp() {
        WebElement signupLink = driver.findElement(loc_signup_link);
        signupLink.click();
    }

    public void gotoPricingPage() {
        WebElement pricingLinkELem = driver.findElement(loc_pricing_link);
        Actions actions = new Actions(driver);
        actions.moveToElement(pricingLinkELem)
                .perform();
        pricingLinkELem.click();
    }

    public void gotoAppsPage() {
        WebElement appsLinkElem = driver.findElement(loc_apps_link);
        Actions actions = new Actions(driver);
        actions.moveToElement(appsLinkElem)
                .perform();
        appsLinkElem.click();
    }

    public void gotoAboutPage() {
        WebElement aboutLinkElem = driver.findElement(loc_about_link);
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutLinkElem)
                .perform();
        aboutLinkElem.click();
    }
    public void gotoAutomationPage(){
        WebElement automationLinkElem = driver.findElement(loc_automation_link);
        Actions actions = new Actions(driver);
        actions.moveToElement(automationLinkElem)
                .perform();
        automationLinkElem.click();

    }
}