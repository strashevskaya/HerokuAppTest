package tests;

import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class JSAlertsTest extends BaseTest {

    @Test
    public void verifyJSAlert() {
        jsAlertsPage.openPage();
        jsAlertsPage.validateJSAlert("You successfuly clicked an alert");
    }

    @Test
    public void verifyJSConfirmAlert() {
        jsAlertsPage.openPage();
        jsAlertsPage.validateJSConfirmAlert("You clicked: Ok");
    }

    @Test
    public void verifyJSPromptAlert() {
        jsAlertsPage.openPage();
        jsAlertsPage.validateJSPromptAlert("Alert", "You entered: Alert");
    }
}
