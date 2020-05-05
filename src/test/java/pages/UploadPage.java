package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class UploadPage extends BasePage {

    private static final String UPLOAD_URL = "http://the-internet.herokuapp.com/upload";

    private static final By CHOOSE_FILE = By.id("file-upload");
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final By FILE_UPLOADED_TEXT = By.cssSelector("h3");


    public UploadPage(WebDriver driver) {
    super(driver);
    }

    public void openPage() {
        driver.get(UPLOAD_URL);
    }

    public void validateFileUpload(String downloadFileLink) {
    driver.findElement(CHOOSE_FILE).sendKeys(downloadFileLink);
    driver.findElement(UPLOAD_BUTTON).click();
    }

    public void validateUploadedFileLink() {
        Assert.assertTrue(driver.findElement(FILE_UPLOADED_TEXT).isDisplayed(), "File isn't download");
}
}

