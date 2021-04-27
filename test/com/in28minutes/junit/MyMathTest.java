package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyMathTest {
    /* Note:
       it is better performance to create a single instance than many of the same,
       but be careful if using variable in the objects state with multiple tests
       because the variable would not be new between each tests.
       Remember to initialize every variable of the object back to default value before each test.
     */
    MyMath myMath = new MyMath();

    @Test
    public void sumWithThreeNumbers() {
        // 1,2,3 => 6
        System.out.println(myMath.sum(new int[]{1,2,3})); // we can still use system output in tests
        // 6

        // the real test of junit...
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
    }

    @Test
    public void sumWithOneNumber() {
        assertEquals(3, myMath.sum(new int[]{3}));
    }
}