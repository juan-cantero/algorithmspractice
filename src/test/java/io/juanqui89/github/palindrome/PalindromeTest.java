package io.juanqui89.github.palindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeTest {

  @Test
  public void testIsPalindrome() {
    Boolean isPalindrome = Palindrome.isPalindrome("abdba") ;
    assertTrue(isPalindrome);
  }

  @Test
  public void testIsPalindrome2() {
    assertTrue(Palindrome.isPalindrome2("abdba"));
  }
}