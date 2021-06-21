package main

import "fmt"

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Easy (and slow) way
// func twoSum(nums []int, target int) []int {
// 	var result []int

// 	for i := 0; i < len(nums)-1; i++ {
// 		for j := i + 1; j < len(nums); j++ {
// 			if nums[i]+nums[j] == target {
// 				result = append(result, i, j)
// 				return result
// 			}
// 		}
// 	}
// 	return result
// }

func twoSum(nums []int, target int) []int {
	var result []int
	numsMap := make(map[int]int)

	for i, val := range nums {
		numsMap[val] = i
	}

	for i, val := range nums {
		if _, ok := numsMap[target-val]; ok && numsMap[target-val] != i {
			result = append(result, i, numsMap[target-val])
			return result
		}
	}
	return result
}

func main() {
	fmt.Println(
		twoSum([]int{11, 33, 44, 22}, 66),
		twoSum([]int{3, 3}, 6),
		twoSum([]int{3, 2, 3}, 6),
	)
}
