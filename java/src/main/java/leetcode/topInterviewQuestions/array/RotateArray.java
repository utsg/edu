package leetcode.topInterviewQuestions.array;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i+k) % nums.length] = nums[i];
        }
        System.arraycopy(a, 0, nums, 0, nums.length);
        return nums;
    }
}
