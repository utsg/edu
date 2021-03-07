package leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString reverser = new ReverseString();

    @Test
    public void basicTests() {
        reverser.reverseString(new char[] {'h','a','n','n','a','H'});
    }
}