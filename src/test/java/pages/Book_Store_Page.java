package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser_Utils;
import utilities.Config_Reader;
import utilities.Driver;
import java.util.List;


public class Book_Store_Page extends Base_Page {


    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "userName-value")
    public WebElement userName;

    @FindBy(id = "submit")
    public WebElement logOutButton;

    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[text()='No rows found']")
    public WebElement noRowsFoundTitle;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement product1;

    @FindBy(xpath = "//button[.='Add To Your Collection']")
    public WebElement addToYourCollectionButton;

    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    public WebElement product2;


    //=========================================================================================================


    public void navigateToBooksStorePage(){

        Driver.getDriver().get(Config_Reader.get("url"));
        Browser_Utils.waitFor(2);
    }


    public void searchBoxClear(WebElement element){

        element.clear();
    }


    public boolean verifySearchResults(String searchedText) {

        List<WebElement> searchResultsLists = Driver.getDriver().findElements(By.xpath("//span[@class='mr-2']"));

        boolean containsText = true;

        for (WebElement searchResult : searchResultsLists){
            String searchResultText = searchResult.getText().toLowerCase();
            if(!searchResultText.contains(searchedText.toLowerCase())){
                containsText = false;
                break;
            }
        }
        return containsText;
    }


}

