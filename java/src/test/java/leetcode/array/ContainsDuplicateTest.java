package leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate duplicate = new ContainsDuplicate();

    @Test
    public void basicTest() {
        assertEquals(true, duplicate.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
}