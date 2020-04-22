import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
    @Test
    public void webElements(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.tut.by/");
        driver.findElement(By.name("action"));
        driver.findElement(By.linkText("Хочу у вас работать"));
        driver.findElement(By.partialLinkText("Изображения"));
        driver.findElement(By.tagName("span"));
        driver.findElement(By.className("supernova-dashboard-header"));
        driver.get("https://jobs.tut.by/account/login?backurl=%2F");
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("div.bloko-form-row > input"));
        driver.findElement(By.cssSelector("div span"));
        driver.findElement(By.cssSelector("[lang|=ru]"));
        driver.findElement(By.cssSelector("div + form"));
        driver.findElement(By.cssSelector("[type]"));
        driver.findElement(By.cssSelector("div.account-register_button"));
        driver.findElement(By.cssSelector("a[href^='https']"));
        driver.findElement(By.cssSelector("a[href*='employer']"));
        driver.findElement(By.cssSelector("*"));
        driver.get("https://m.jobs.tut.by/account/signup");
        driver.findElement(By.xpath("//div"));
        driver.findElement(By.xpath("//div/a"));
        driver.findElement(By.xpath("//*/form"));
        driver.findElement(By.xpath("(//*//input)[3]"));
        driver.findElement(By.xpath("//input[@name='lastName']"));
        driver.findElement(By.xpath("//*"));
        driver.quit();
}

}