package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationPage {
    // Fields
    private WebDriver driver;
    private By loc_automate_banner = By.cssSelector("h1");
    private By loc_try_butler = By.linkText("Try Butler");
    private By loc_learn_trello = By.linkText("Learn more about Trello’s plans and pricing.");
    private By loc_lady_board_img = By.cssSelector("img[alt='butler-header']");
    private By loc_move_cards_img = By.cssSelector("img[alt='Illo-Flowchart']");
    private By loc_checklist_img = By.cssSelector("img[alt='Spot-Illo Rules']");
    private By loc_next_step_img = By.cssSelector("img[alt='spot-illo-butler-button']");
    private By loc_purple_pink_img = By.cssSelector("img[alt='spot-illo-favorite apps']");
    private By loc_blue_purple_img = By.cssSelector("img[alt='Spot-illo Automation']");
    private By loc_multi_brands_img = By.cssSelector(".grid__Column-sc-14e1dud-2.lkeEZk.ui-column");

    // Constructor
    public AutomationPage(WebDriver inputDriver){
        driver = inputDriver;
    }

    //Methods
    public boolean isPageDisplayed(){
        WebElement autoBannerElem = driver.findElement(loc_automate_banner);
        WebElement tryButlerElem = driver.findElement(loc_try_butler);
        WebElement learnTrelloElem = driver.findElement(loc_learn_trello);
        WebElement ladyBoardElem = driver.findElement(loc_lady_board_img);
        WebElement moveCardElem = driver.findElement(loc_move_cards_img);
        WebElement checkListElem = driver.findElement(loc_checklist_img);
        WebElement nextStepElem = driver.findElement(loc_next_step_img);
        WebElement purplePinkElem = driver.findElement(loc_purple_pink_img);
        WebElement bluePurpleElem = driver.findElement(loc_blue_purple_img);
        WebElement multiBrandsElem = driver.findElement(loc_multi_brands_img);

        // validating that each platform images are displayed
        boolean isAutoBannerElemThere = autoBannerElem.isDisplayed();
        boolean isTryButlerElemThere = tryButlerElem.isDisplayed();
        boolean isLearnTrelloElemThere = learnTrelloElem.isDisplayed();
        boolean isLadyBoardElemThere = ladyBoardElem.isDisplayed();
        boolean isMoverCardElemThere = moveCardElem.isDisplayed();
        boolean isCheckListElemThere = checkListElem.isDisplayed();
        boolean isNextStepElemThere = nextStepElem.isDisplayed();
        boolean isPurplePinkElemThere = purplePinkElem.isDisplayed();
        boolean isBluePurpleElemThere = bluePurpleElem.isDisplayed();
        boolean isMultiBrandElemThere = multiBrandsElem.isDisplayed();

        return isAutoBannerElemThere &&
               isTryButlerElemThere &&
                isLearnTrelloElemThere &&
                isLadyBoardElemThere &&
                isMoverCardElemThere &&
                isCheckListElemThere &&
                isNextStepElemThere &&
                isPurplePinkElemThere &&
                isBluePurpleElemThere &&
                isMultiBrandElemThere;

    }
    public boolean isImagesDisplayed(){
        List<WebElement> imagesDisplayed = driver.findElements(loc_multi_brands_img);
        boolean result = true;
        for(int i = 0; i < imagesDisplayed.size(); i++){
            boolean isImagesDisplayed = imagesDisplayed.get(i).isDisplayed();
            result = result && isImagesDisplayed;
        }
        return result;
    }
}
