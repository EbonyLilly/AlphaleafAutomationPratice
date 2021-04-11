package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutPage {
    // Field
    private WebDriver driver;
    private By loc_about_banner = By.cssSelector("//h1");
    private By loc_download_brand_asserts = By.linkText(".dAzKom.grid__Container-sc-14e1dud-0.ui-section__container span");
    private By loc_fog_creek_link = By.linkText("Fog Creek Software");

    // Constructor
    public boolean isAboutPageDisplayed(){
        WebElement aboutBanner = driver.findElement(loc_about_banner);
        return aboutBanner.isDisplayed();
    }

    // Methods
    public boolean isPageDisplayed(){
        WebElement aboutBannerElem = driver.findElement(loc_about_banner);
        WebElement downloadElem = driver.findElement(loc_download_brand_asserts);
        WebElement fogCreekElem = driver.findElement(loc_fog_creek_link);


        boolean isAboutBannerElemThere = aboutBannerElem.isDisplayed();
        boolean isDownloadElemThere = downloadElem.isDisplayed();
        boolean isForCreekElemThere = fogCreekElem.isDisplayed();

        return ( isAboutBannerElemThere && isDownloadElemThere && isForCreekElemThere);
    }
    public boolean isLinksClickable(){
        List<WebElement> linksClickable = driver.findElements(loc_download_brand_asserts);
        boolean result = true;
        for (int i = 0; i < linksClickable.size(); i++){
            boolean isClickable = linksClickable.get(i).isEnabled();
            result = result && isClickable;
        }
        return result;
    }
}
