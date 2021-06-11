package main

import "fmt"

func SumCubes(n int) int {
	var sum int = 0
	for i := 1; i <= n; i++ {
		sum += i * i * i
	}
	return sum
}

func main() {
	fmt.Println(SumCubes(2))
	fmt.Println(SumCubes(3))
}
