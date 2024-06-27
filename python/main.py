def count_vowels(word):
    vowels = {'a', 'e', 'i', 'o', 'u'}
    word = word.lower()
    count = 0
    for c in word:
        if c in vowels:
            count += 1

    return count

if __name__ == "__main__":
    print(count_vowels("Celebration"))

    print(count_vowels("Palm"))

    print(count_vowels("Prediction"))