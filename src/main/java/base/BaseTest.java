package base;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static utils.PropertyLoader.getValueFromConfigurationFile;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().getChromeDriver();
        driver.get(getValueFromConfigurationFile("url.base"));
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}