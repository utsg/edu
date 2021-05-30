package main

import (
	"fmt"
)

func BubbleSort(array *[]int) {
	for i := 0; i < len(*array) - 1; i++ {
		for j := i + 1; j < len(*array); j++ {
			if (*array)[j] < (*array)[i] {
				bubble := (*array)[i]
				(*array)[i] = (*array)[j]
				(*array)[j] = bubble
			}
		}
	}
}

func main() {
	unsorted := []int{5,4,3,2,1}
	fmt.Println("Unsorted:", unsorted)

	BubbleSort(&unsorted)
	fmt.Println("Sorted:", unsorted)
}
