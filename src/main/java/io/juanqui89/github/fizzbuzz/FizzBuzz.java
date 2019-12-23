package io.juanqui89.github.fizzbuzz;
// --- Directions
// Write a program that console logs the numbers
// from 1 to n. But for multiples of three print
// “fizz” instead of the number and for the multiples
// of five print “buzz”. For numbers which are multiples
// of both three and five print “fizzbuzz”.
// --- Example
//   fizzBuzz(5);
//   1
//   2
//   fizz
//   4
//   buzz

public class FizzBuzz {

  public static boolean isMultipleOf (int multiplier, int n) {
    return n % multiplier == 0;
  }

  public static String fizzBuzz(int n ) {
    StringBuilder str = new StringBuilder();
    for (int i = 1; i <= n ; i++) {

      if (isMultipleOf(3,i) && isMultipleOf(5,i)) str.append("fizzBuzz");
      else if (isMultipleOf(3,i)) str.append("fizz" );
      else if (isMultipleOf(5,i)) str.append("buzz");
      else str.append(i);
      str.append("\n");
    }
    return str.toString();
  }

  public static void main(String[] args) {
    System.out.println(FizzBuzz.fizzBuzz(15));
  }

}
