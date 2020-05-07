package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorSumTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting new Calculator");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing Calculator");
    }

    @Test(retryAnalyzer = RetryAnalizer.class)
    public void sum() {
        int newSum = new CalculatorTest().sum(2, 5);
        Assert.assertEquals(newSum, 7);
    }
}
