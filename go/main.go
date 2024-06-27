package main

import (
	"fmt"
	"unicode"
)

func main() {
	fmt.Println(count_vowels("Celebration"))
	fmt.Println(count_vowels("Palm"))
	fmt.Println(count_vowels("Prediction"))
}

func count_vowels(word string) int {
	count := 0
	for _, char := range word {
		char = unicode.ToLower(char)
		if char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' {
			count += 1
		}
	}
	return count
}
