package io.juanqui89.github.fibonacci;

// --- Directions
// Print out the n-th entry in the fibonacci series.
// The fibonacci series is an ordering of numbers where
// each number is the sum of the preceeding two.
// For example, the sequence
//  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
// forms the first ten entries of the fibonacci series.
// Example:
//   fib(4) === 3

public class Fibonacci {

  public static int getFibonacciOf(int n) {
    if (n <=1 )
      return n;
    return getFibonacciOf(n -1) + getFibonacciOf(n-2);
  }

  public static int fib(int n ) {
    int a = 0;
    int b = 1;
    int c = 0;
    for (int i = 0; i < n -1 ; i++) {
       c = a + b;
       a = b;
       b = c;
    }
    return c;
  }
}
