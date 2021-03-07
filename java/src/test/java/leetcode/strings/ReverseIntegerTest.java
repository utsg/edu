package leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void basicTests() {
        assertEquals(123, reverseInteger.reverse(321));
        assertEquals(-123, reverseInteger.reverse(-321));
    }
}