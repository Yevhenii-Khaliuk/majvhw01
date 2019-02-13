package com.khaliuk;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RestoreArrayTest {
    @Test
    public void testRestoreArrayReturnsProperResult() {
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualResult = RestoreArray.restoreArray(new int[] {1, -1, 3, 4, -2, 6});
        assertArrayEquals(expectedResult, actualResult);
    }
}