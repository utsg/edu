package main

import (
	"fmt"
	"regexp"
)

func main() {
	var password string

	fmt.Scan(&password)

	isLatinAndDigit, _ := regexp.MatchString("[a-zA-Z\\d]", password)

	if len(password) < 5 || !isLatinAndDigit {
		fmt.Println("Wrong password")
	} else {
		fmt.Println("Ok")
	}
}
