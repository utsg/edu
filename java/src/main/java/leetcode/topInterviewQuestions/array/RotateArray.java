package leetcode.topInterviewQuestions.array;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if (k > 0) {
            int last = nums[nums.length - 1];
            for (int i = nums.length -1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            return rotate(nums, (k-1));
        }
        return nums;
    }
}
