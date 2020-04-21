import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tables {

    @Test
    public void lastName(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String lastname1 = driver.findElement(By.xpath("//table//tr[1]/td[1]")).getText();
        String lastname2 = driver.findElement(By.xpath("//table//tr[2]/td[1]")).getText();
        String lastname3 = driver.findElement(By.xpath("//table//tr[3]/td[1]")).getText();
        String lastname4 = driver.findElement(By.xpath("//table//tr[4]/td[1]")).getText();

        Assert.assertEquals(lastname1, "Smith", "Данные не совпадают" );
        Assert.assertEquals(lastname2, "Bach", "Данные не совпадают" );
        Assert.assertEquals(lastname3, "Doe", "Данные не совпадают" );
        Assert.assertEquals(lastname4, "Conway", "Данные не совпадают" );
        driver.quit();

    }
    @Test
    public void firstName(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String firstname1 = driver.findElement(By.xpath("//table//tr[1]/td[2]")).getText();
        String firstname2 = driver.findElement(By.xpath("//table//tr[2]/td[2]")).getText();
        String firstname3 = driver.findElement(By.xpath("//table//tr[3]/td[2]")).getText();
        String firstname4 = driver.findElement(By.xpath("//table//tr[4]/td[2]")).getText();

        Assert.assertEquals(firstname1, "John", "Данные не совпадают" );
        Assert.assertEquals(firstname2, "Frank", "Данные не совпадают" );
        Assert.assertEquals(firstname3, "Jason", "Данные не совпадают" );
        Assert.assertEquals(firstname4, "Tim", "Данные не совпадают" );
        driver.quit();

    }
    @Test
    public void emails(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String email1 = driver.findElement(By.xpath("//table//tr[1]/td[3]")).getText();
        String email2 = driver.findElement(By.xpath("//table//tr[2]/td[3]")).getText();
        String email3 = driver.findElement(By.xpath("//table//tr[3]/td[3]")).getText();
        String email4 = driver.findElement(By.xpath("//table//tr[4]/td[3]")).getText();

        Assert.assertEquals(email1, "jsmith@gmail.com", "Данные не совпадают" );
        Assert.assertEquals(email2, "fbach@yahoo.com", "Данные не совпадают" );
        Assert.assertEquals(email3, "jdoe@hotmail.com", "Данные не совпадают" );
        Assert.assertEquals(email4, "tconway@earthlink.net", "Данные не совпадают" );
        driver.quit();
    }
    @Test
    public void due(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String due1 = driver.findElement(By.xpath("//table//tr[1]/td[4]")).getText();
        String due2 = driver.findElement(By.xpath("//table//tr[2]/td[4]")).getText();
        String due3 = driver.findElement(By.xpath("//table//tr[3]/td[4]")).getText();
        String due4 = driver.findElement(By.xpath("//table//tr[4]/td[4]")).getText();

        Assert.assertEquals(due1, "$50.00", "Суммы не совпадают" );
        Assert.assertEquals(due2, "$51.00", "Суммы не совпадают" );
        Assert.assertEquals(due3, "$100.00", "Суммы не совпадают" );
        Assert.assertEquals(due4, "$50.00", "Суммы не совпадают" );
        driver.quit();
    }
    @Test
    public void webSite(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        String website1 = driver.findElement(By.xpath("//table//tr[1]/td[5]")).getText();
        String website2 = driver.findElement(By.xpath("//table//tr[2]/td[5]")).getText();
        String website3 = driver.findElement(By.xpath("//table//tr[3]/td[5]")).getText();
        String website4 = driver.findElement(By.xpath("//table//tr[4]/td[5]")).getText();

        Assert.assertEquals(website1, "http://www.jsmith.com", "Данные не совпадают" );
        Assert.assertEquals(website2, "http://www.frank.com", "Данные не совпадают" );
        Assert.assertEquals(website3, "http://www.jdoe.com", "Данные не совпадают" );
        Assert.assertEquals(website4, "http://www.timconway.com", "Данные не совпадают" );
        driver.quit();

    }
}


