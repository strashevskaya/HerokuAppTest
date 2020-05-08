package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.JSAlertsPage;
import pages.UploadPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    UploadPage uploadPage;
    ContextMenuPage contextMenuPage;
    JSAlertsPage jsAlertsPage;

    @BeforeMethod
public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        uploadPage = new UploadPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        jsAlertsPage = new JSAlertsPage(driver);


    }

    @AfterMethod(alwaysRun=true)
    public void closeBrowser() {
        driver.quit();
    }
}
