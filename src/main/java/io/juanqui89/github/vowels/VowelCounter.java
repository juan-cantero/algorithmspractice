package io.juanqui89.github.vowels;
// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelCounter {

  public static long countVowels(String text) {
    //(?i) case-insensitive
    String pattern = "(?i)[aeiou]";
    Predicate<String> isVowel = w -> w.matches(pattern);
    long totalVowels = Stream.of(text.split(""))
            .filter(isVowel)
            .count();
    return totalVowels;
  }



}
