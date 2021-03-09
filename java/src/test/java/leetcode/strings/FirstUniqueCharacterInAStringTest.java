package leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {
    FirstUniqueCharacterInAString res = new FirstUniqueCharacterInAString();

    @Test
    public void basicTests() {
        assertEquals(0, res.firstUniqChar("leetcode"));
        assertEquals(2, res.firstUniqChar("loveleetcode"));
    }
}