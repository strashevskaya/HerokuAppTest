import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckBoxes {

    @Test
    public void CheckBox() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        List<WebElement> arr = driver.findElements(By.xpath("//*[@type='checkbox']"));
        WebElement checkbox1 = arr.get(0);
        assertFalse(checkbox1.isSelected());
        checkbox1.click();
        assertTrue(checkbox1.isSelected());
        WebElement checkbox2 = arr.get(1);
        assertTrue(checkbox2.isSelected());
        checkbox2.click();
        assertFalse(checkbox2.isSelected());
        driver.quit();
    }
}
