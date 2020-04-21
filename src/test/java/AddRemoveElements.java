import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElements {

    @Test
    public void addElememts() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElement.click();
        addElement.click();

        WebElement deleteElement = driver.findElement(By.xpath("//button[text()='Delete']"));
        deleteElement.click();
        int elements = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        assertEquals(elements, 1,"Колличество элементов не равно 1");
        driver.quit();
    }


}
