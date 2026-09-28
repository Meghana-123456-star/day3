# Day 3 — Java Strings Practice

Today I revised and practiced Java String concepts through hands-on coding problems.

## Topics Covered

* String creation and input
* `length()`
* `charAt()`
* `equals()`
* `toUpperCase()`
* `toLowerCase()`
* `replace()`
* `split()`
* `indexOf()`
* String reversal
* Palindrome checking
* Vowel counting
* Character counting
* Word counting
* Removing spaces
* Reversing words
* Anagram checking
* Removing duplicate characters
* Character frequency
* `StringBuilder`
* Basic frequency-array technique

## Programs

1. Reverse a String using a loop
2. Reverse a String using `StringBuilder`
3. String Palindrome
4. Count Vowels
5. Count Characters
6. Count Words
7. Remove Spaces
8. Reverse Words
9. Check Anagram
10. Remove Duplicate Characters
11. Character Frequency
12. Student Name Analyzer

## DSA Pattern Practiced

### Character Traversal

```java
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
}
```

### Frequency Array

```java
int[] frequency = new int[256];

frequency[ch]++;
```

## Mini Project

### Student Name Analyzer

The program accepts a student's full name and displays:

* Original name
* Name length
* Uppercase name
* Lowercase name
* First character
* Last character
* Number of words
* Name without spaces

## What I Learned

I practiced processing strings character by character and understood how basic String operations can be used to solve beginner DSA problems.

## Next Step

Continue with the next day of my Core Java revision and strengthen problem-solving through hands-on practice.
