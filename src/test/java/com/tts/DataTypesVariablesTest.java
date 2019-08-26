package com.tts;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataTypesVariablesTest {

    private int methodCount;
    private String className;

    @Test
    public void checkDefaultsForAttributes() {
        assertEquals(0, methodCount);
        assertNull(className);
    }

    @Test
    public void incrementMethodCount() {
        int mainInt = 1;
        methodCount += mainInt;
        assertEquals(1, methodCount);
    }

    @Test
    public void castFloatToInt() {
        float f = 856.2f;
        int castFloat = (int) f;

    }

    @Test
    public void testAddition() {
        int x = 5;
        int y = 10;
        int z = x + y;
        assertEquals(5 + 10, z);
    }

}