package com.khaliuk;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayRotationTest {
    @Test
    public void testRotateArrayReturnsCorrectResultWithKayGreaterThanZero() {
        int[] expectedResult = new int[] {6, 7, 8, 1, 2, 3, 4, 5};
        int[] actualResult = ArrayRotation.rotateArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 5);
        assertArrayEquals(expectedResult, actualResult);
    }
}