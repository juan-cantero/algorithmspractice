package io.juanqui89.github.palindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeTest {

  @Test
  public void testIsPalindrome() {
    Boolean isPalindrome = Palindrome.isPalindrome("abba") ;
    assertTrue(isPalindrome);
  }
}