package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSubTest {

    @Test(description="verifying the sudtraction function", priority = 1)
    public void subtraction() {
        int sub = new CalculatorTest().sub(9, 3);
        Assert.assertEquals(sub,6 );
    }
    @Test(description="verifying the subtraction function", priority = 2)
    public void subtraction2() {
        int sub2 = new CalculatorTest().sub(8, 5);
        Assert.assertEquals(sub2, 3);
    }

}
