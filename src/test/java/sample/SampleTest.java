package sample;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SamplePage;

import static org.testng.Assert.assertTrue;

public class SampleTest extends BaseTest {

    @Test
    public void shouldLoadSamplePage() {
        SamplePage samplePage = new SamplePage(driver);
        boolean testResult = samplePage.sampleElementIsPresent();

        assertTrue(testResult);
    }
}
