package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JSAlertsPage extends BasePage {

    private static final String JS_ALERTS_URL = "http://the-internet.herokuapp.com/javascript_alerts";
    private static final By JS_ALERT_BUTTON = By.xpath("//*/button[@onclick='jsAlert()']");
    private static final By JS_CONFIRM_BUTTON = By.xpath("//*/button[@onclick='jsConfirm()']");
    private static final By JS_PROMPT_BUTTON = By.xpath("//*/button[@onclick='jsPrompt()']");
    private static final By JS_RESULT = By.id("result");

    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(JS_ALERTS_URL);
    }

    public void validateJSAlert(String resultText) {
        driver.findElement(JS_ALERT_BUTTON).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String actualText = driver.findElement(JS_RESULT).getText();
        Assert.assertEquals(actualText, resultText, "JS Alert message isn't correct");

    }

    public void validateJSConfirmAlert(String resultText) {
        driver.findElement(JS_CONFIRM_BUTTON).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String actualText = driver.findElement(JS_RESULT).getText();
        Assert.assertEquals(actualText, resultText, "JS Confirm Alert message isn't correct");
    }

    public void validateJSPromptAlert(String inputMessage, String resultText) {
        driver.findElement(JS_PROMPT_BUTTON).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(inputMessage);
        alert.accept();
        String actualText = driver.findElement(JS_RESULT).getText();
        Assert.assertEquals(actualText, resultText, "JS Prompt Alert message isn't correct");
    }

}
