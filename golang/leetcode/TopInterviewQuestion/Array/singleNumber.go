package main

import (
	"fmt"
)

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

func singleNumber(nums []int) int {
	result := make(map[int]int)

	for _, val := range nums {
		if _, exist := result[val]; !exist {
			result[val] = 1
		} else {
			delete(result, val)
		}
	}

	for key := range result {
		return key
	}

	return 0
}

func main() {
	fmt.Println(
		singleNumber([]int{2, 2, 1}),
		singleNumber([]int{4, 1, 2, 1, 2}),
		singleNumber([]int{1}),
	)
}
