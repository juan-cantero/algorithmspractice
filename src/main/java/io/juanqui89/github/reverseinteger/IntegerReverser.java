package io.juanqui89.github.reverseinteger;

// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

public class IntegerReverser {

  public static int reverseNumber(int n) {
    int reversed = 0;
    while (n > 0 || n < 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n = n / 10;
    }
    return reversed;
  }
}
