package main

func rotate(nums []int, k int) {
	if k > 0 {
		last := nums[len(nums)-1]
		for i := len(nums) - 1; i > 0; i-- {
			nums[i] = nums[i-1]
		}
		nums[0] = last
		rotate(nums, (k - 1))
	}
}

func main() {
	rotate([]int{1, 2, 3, 4, 5, 6, 7}, 3)
	rotate([]int{1, 2, 3, 4, 5}, 3)
	rotate([]int{1, 2, 3, 4, 5, 6, 7}, 3)
}
