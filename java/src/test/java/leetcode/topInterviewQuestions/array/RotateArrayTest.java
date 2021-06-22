package leetcode.topInterviewQuestions.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void basicTest() {
        System.out.println(Arrays.toString(rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3)));
        assertTrue(
                Arrays.equals(new int[]{5,6,7,1,2,3,4}, rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3))
        );
    }
}