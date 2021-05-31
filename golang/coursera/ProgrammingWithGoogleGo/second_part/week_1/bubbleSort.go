package main

import (
	"fmt"
)

func Swap(a int, b int) (int, int) {
	bubble := a
	a = b
	b = bubble
	return a, b
}

func BubbleSort(array *[]int) {
	for i := 0; i < len(*array)-1; i++ {
		for j := i + 1; j < len(*array); j++ {
			if (*array)[j] < (*array)[i] {
				(*array)[i], (*array)[j] = Swap((*array)[i], (*array)[j])
			}
		}
	}
}

func main() {
	unsorted := []int{5, 4, 3, 2, 1}
	fmt.Println("Unsorted:", unsorted)

	BubbleSort(&unsorted)
	fmt.Println("Sorted:", unsorted)
}
