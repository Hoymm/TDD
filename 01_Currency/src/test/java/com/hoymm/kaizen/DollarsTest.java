package com.hoymm.kaizen;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarsTest {

    @Test
    public void testMultiplication(){
        Dollar money = new Dollar(30);
        money.times(2);
        assertEquals(60, money.amount);
    }
}
