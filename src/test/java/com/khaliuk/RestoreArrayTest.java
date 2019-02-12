package com.khaliuk;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RestoreArrayTest {
    RestoreArray restore;

    @Before
    public void setUp() {
        restore = new RestoreArray();
    }

    @Test
    public void testRestoreArrayReturnsProperResult() {
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualResult = restore.restoreArray(new int[] {1, -1, 3, 4, -2, 6});
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }
}