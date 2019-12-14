package io.juanqui89.github.palindrome;

public class Palindrome {
  // --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") === true
//   palindrome("abcdefg") === false

  public static boolean isPalindrome(String str) {
    return new StringBuilder(str)
                  .reverse()
                  .toString()
                  .equalsIgnoreCase(str);
  }
}
