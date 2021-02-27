package kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextBiggerNumberWithSameDigitTest {
    @Test
    public void basicTests() {
        assertEquals(-1, NextBiggerNumberWithSameDigit.nextBiggerNumber(0));
        assertEquals(-1, NextBiggerNumberWithSameDigit.nextBiggerNumber(111));
        assertEquals(21, NextBiggerNumberWithSameDigit.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumberWithSameDigit.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumberWithSameDigit.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumberWithSameDigit.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumberWithSameDigit.nextBiggerNumber(144));
        assertEquals(19009, NextBiggerNumberWithSameDigit.nextBiggerNumber(10990));
    }
}