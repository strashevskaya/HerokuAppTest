import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs {

    @Test
    public void checkCorrectInput() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("7");
        String text = input.getAttribute("value");
        Assert.assertEquals(text,"7", "Первое значение не совпадает со вторым");
        driver.quit();
    }
    @Test
    public void checkIncorrectInput(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("R");
        String text = input.getAttribute("value");
        Assert.assertEquals(text, "","Первое значение не совпадает со вторым");
        driver.quit();
    }

    @Test
    public void upValueInput(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("-2");
        input.sendKeys(Keys.ARROW_UP);
        String text = input.getAttribute("value");
        Assert.assertEquals(text, "-1", "Значения не совпадают");
        driver.quit();
    }


    @Test
    public void downValueInput(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("25");
        input.sendKeys(Keys.ARROW_DOWN);
        String text = input.getAttribute("value");
        Assert.assertEquals(text, "24", "Значения не совпадают");
        driver.quit();

    }
}
