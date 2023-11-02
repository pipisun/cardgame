import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.concurrent.*;

import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class cad {
    private IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "16.6.1");
        capabilities.setCapability("deviceName", "iPhone (2)");
        capabilities.setCapability("udid", "00008110-000805C61E87801E");
        capabilities.setCapability("bundleId", "com.tether.solitaire.klondike");
        capabilities.setCapability("automationName", "XCUITest");
//        capabilities.setCapability("xcodeOrgId", "Songtao Sun (Personal Team)");
//        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
//        capabilities.setCapability("updatedWDABundleId", "abc.def.ghi.jkl.webdriverrunner");
//        capabilities.setCapability("appiumVersion", "1.13.0");

        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @After
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }

    @Test
    public void testFindingAnElement() throws InterruptedException {
        // Start
        driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Solitaire Cube\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")).click();


        driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"match_select_cell_practice\"])[1]")).click();
    }
}
