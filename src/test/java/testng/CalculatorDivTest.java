package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivTest {

    @DataProvider(name = "Divide")
    public Object[][] dataForDivision() {
        return new Object[][]{
                {6, 3, 2},
                {3, 3, 1},
                {18, 6, 3},
        };
    }
        @Test(dataProvider = "Divide")
        public void div(int a, int b, int c) {
            int newDiv = new CalculatorTest().div(a, b);
            Assert.assertEquals(newDiv, c);
        }
        @Test(invocationCount = 2, threadPoolSize = 3)
        public void div2() {
            int newDiv = new CalculatorTest().div(6, 3);
            Assert.assertEquals(newDiv, 2);
        }
    }

