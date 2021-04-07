package test;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class SmokeTest extends TestBase {
    @Test
    public void verifyHomePageIsDisplayed(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        boolean result = homePage.isPageVisible();
        Assert.assertTrue(result);

    }

    @Test
    public void verifyLoginPageIsDisplayed() throws InterruptedException {
        // Test Data
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        //Test Steps
        homePage.open();
        homePage.gotoLoginPAge();
        Thread.sleep(1000);
        boolean result = loginPage.isLoginPageVisible();

        // Test Assertion
        Assert.assertTrue(result);

    }
    @Test
    public void verifySignUpPageIsDisplayed() throws InterruptedException {
        // Test Data
        HomePage homePage = new HomePage(getDriver());
        SignupPage signupPage = new SignupPage(getDriver());

        // Test Steps
        homePage.open();
        homePage.gotoSignUp();
        Thread.sleep(2000);
        boolean result = signupPage.isSignUpVisible();

        // Test Assert
        Assert.assertTrue(result);
    }

}
