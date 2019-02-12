package com.khaliuk;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayRotationTest {
    ArrayRotation arrayRotation;

    @Before
    public void setUp() {
        arrayRotation = new ArrayRotation();
    }

    @Test
    public void testRotateArrayReturnsCorrectResultWithKayGreaterThanZero() {
        int[] expectedResult = new int[] {6, 7, 8, 1, 2, 3, 4, 5};
        int[] actualResult = arrayRotation.rotateArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 5);
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }
}