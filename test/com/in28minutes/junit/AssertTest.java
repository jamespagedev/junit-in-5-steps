package com.in28minutes.junit;

import static org.junit.Assert.*; // use if 3 or more imports from Assert package

import org.junit.Test;

public class AssertTest {
    @Test
    public void testAssertEquals() {
        assertEquals(1, 1);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNull() {
        MyMath myMath = new MyMath();
        myMath = null;
        assertNull(myMath);
    }

    @Test
    public void testAssertNotNull() {
        MyMath myMath = new MyMath();
        assertNotNull(myMath);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] arrOne = {1,2,3};
        int[] arrTwo = {1,2,3};
        assertArrayEquals(arrOne, arrTwo);
    }
}
