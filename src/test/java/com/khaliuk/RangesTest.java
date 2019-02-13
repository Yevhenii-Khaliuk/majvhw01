package com.khaliuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RangesTest {
    @Test
    public void testArrayRangesCorrectForDifferentArgumentsWithFirstAndLastTwoElementsBelongToDifferentRanges() {
        String expectedResult = "[1][3 5][7 8][10 14][16 19][22]";
        String actualResult = Ranges.arrayRanges(new int[] {1, 3, 4, 5, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19, 22});
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testArrayRangesCorrectForFirstAndLastTwoElementsBelongToSameRanges() {
        String expectedResult = "[1 5][7 8][10 14][16 20]";
        String actualResult = Ranges.arrayRanges(new int[] {1, 2, 3, 4, 5, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testArrayRangesCorrectForSingleElementArray() {
        String expectedResult = "[1]";
        String actualResult = Ranges.arrayRanges(new int[] {1});
        assertEquals(expectedResult, actualResult);
    }
}