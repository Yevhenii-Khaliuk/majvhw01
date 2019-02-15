package com.khaliuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RangesTest {
    @Test
    public void testArrayRangesForDifferentArgumentsWithFirstAndLastTwoElementsDifferentRanges() {
        String expectedResult = "[1][3 5][7][9][11]";
        String actualResult = Ranges.arrayRanges(new int[] {1, 3, 4, 5, 7, 9, 11});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testArrayRangesCorrectForFirstAndLastTwoElementsBelongToSameRanges() {
        String expectedResult = "[1 5][7][9][11 12]";
        String actualResult = Ranges.arrayRanges(new int[] {1, 2, 3, 4, 5, 7, 9, 11, 12});
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testArrayRangesCorrectForSingleElementArray() {
        String expectedResult = "[1]";
        String actualResult = Ranges.arrayRanges(new int[] {1});
        assertEquals(expectedResult, actualResult);
    }

}