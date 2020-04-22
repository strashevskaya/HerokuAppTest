import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Typos {

    @Test
    public void firstSentence(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        String sentence1 = driver.findElement(By.tagName("p")).getText();
        String sentence2 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        Assert.assertEquals(sentence2, sentence1, "Ошибка в первом предложении");
        driver.quit();
    }
    @Test
    public void secondSentence(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        List<WebElement> lines = driver.findElements(By.tagName("p"));
        WebElement line2 = lines.get(1);
        String text = line2.getText();
        Assert.assertEquals(text, "Sometimes you'll see a typo, other times you won,t.", "Ошибка во втором предложении");
        driver.quit();
    }

}
