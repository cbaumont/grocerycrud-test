package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage extends BasePage {

    @FindBy(id = "switch-version-select")
    WebElement sampleElement;

    public SamplePage(WebDriver driver) {
        super(driver);
    }

    public boolean sampleElementIsPresent() {
        return sampleElement.isDisplayed();
    }


}
