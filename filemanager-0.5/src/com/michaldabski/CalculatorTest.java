package com.michaldabski;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator example;

    @Before
    public void setUp() throws Exception{
        example =new Calculator();
    }

    @Test
    public void cal() throws Exception{
        assertEquals(1,example.cal("dbwed","dqwdfqw"));
    }

    @Test
    public void cal1() throws Exception{
        assertEquals(1,example.cal("abc","abc"));
    }
}