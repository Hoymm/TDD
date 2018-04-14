package com.hoymm.kaizen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciIndex0_shouldReturnValue0(){
        Assert.assertEquals(0, fibonacci.getValueOf(0));
    }

    @Test
    public void fibonacciIndex1_shouldReturnValue1(){
        Assert.assertEquals(1, fibonacci.getValueOf(1));
    }

    @Test
    public void fibonacciIndex2_shouldReturnValue1(){
        Assert.assertEquals(1, fibonacci.getValueOf(2));
    }

    @Test
    public void fibonacciIndex3_shouldReturnValue2(){
        Assert.assertEquals(2, fibonacci.getValueOf(3));
    }

    @Test
    public void fibonacciIndex4_shouldReturnValue3(){
        Assert.assertEquals(3, fibonacci.getValueOf(4));
    }

    @Test
    public void fibonacciIndex5_shouldReturnValue5(){
        Assert.assertEquals(5, fibonacci.getValueOf(5));
    }

    @Test (timeout = 20)
    public void searchForIndex60_shouldGive1548008755920InUnder20ms(){
        Assert.assertEquals(1548008755920L, fibonacci.getValueOf(60));
    }

    @Test (expected = IllegalArgumentException.class)
    public void getValueOfNegativeIndex_shouldThrowIllegalArgumentException(){
        fibonacci.getValueOf(-3);
    }

}
