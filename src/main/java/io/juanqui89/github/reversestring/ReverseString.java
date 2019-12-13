package io.juanqui89.github.reversestring;

public class ReverseString {

  // --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

  public static String reverse(String str) {
    StringBuilder collect = new StringBuilder();
    char [] arr = str.toCharArray();
    for (int i = arr.length -1; i >=  0; i--) {
      collect.append(arr[i]);
    }
    return collect.toString();
  }

  public static String fastReverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
