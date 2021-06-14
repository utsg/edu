package main

import (
	"fmt"
	"math/rand"
)

// You're have a func Random that generates a n numbers from 0 to 1
// Calculate the Pi

func Random(n int) (int, int) {
	var inCirclePoints int = 0
	var totalPoints int = 0

	for i := 0; i < n; i++ {
		x := rand.Float64()
		y := rand.Float64()
		distance := x*x + y*y

		if distance <= 1 {
			inCirclePoints++
		}
		totalPoints++
	}

	fmt.Println(inCirclePoints, totalPoints)

	return inCirclePoints, totalPoints
}

func main() {
	in, total := Random(100000000)
	pi := 4 * float64(in) / float64(total)

	fmt.Println(pi)
}
