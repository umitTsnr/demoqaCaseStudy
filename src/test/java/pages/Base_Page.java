package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class Base_Page {

    public Base_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
