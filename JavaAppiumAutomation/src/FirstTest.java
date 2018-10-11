import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilites = new DesiredCapabilities();

        capabilites.setCapability("platformName","Android");
        capabilites.setCapability("deviceName","AndroidTestDevice");
        capabilites.setCapability("platformVersion","8.1");
        capabilites.setCapability("automationName","Appium");
        capabilites.setCapability("appPackage","org.Wikipedia");
        capabilites.setCapability("appActivity",".main.MainActivity");
        capabilites.setCapability("app","/Users/apalnov/Desktop/Auto Mobile/Lesson 2/JavaAppiumAutomation/apks/org.wikipedia.apk");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4733/wd/hub"), capabilites);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        System.out.println("First test run");
    }

}
