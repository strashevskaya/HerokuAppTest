package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultTest {

    @DataProvider(name = "Multiply")
    public Object[][] dataForMult() {
        return new Object[][] {
                {2, 4, 8},
                {6, 10, 60},
                {8, 3, 24},
        };
    }
    @Test(dataProvider = "Multiply")
    public void multiply(int a, int b, int c) {
        int newMultiply = new CalculatorTest().mult(a, b);
        Assert.assertEquals(newMultiply, c);
    }
}
