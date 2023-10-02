package utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser_Utils {



    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static boolean isElementPresent(WebElement element, int seconds) {

        try {
            waitForVisibility(element, seconds);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public static void waitForVisibility(WebElement element, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            System.out.println("Timeout Exception: " + e.getMessage());
        }
    }


    public static void verifyURL(String expectedURL){
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());
    }


    public static void clickOnElement(WebElement element) {
        element.click();
    }


    public static void sendText(WebElement element, String text){
        element.sendKeys(text);
    }


    public static void clickAndSendText(WebElement element, String text) {
        element.click();
        waitFor(1);
        element.sendKeys(text);
    }


    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }


    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);
        }
    }

}



















