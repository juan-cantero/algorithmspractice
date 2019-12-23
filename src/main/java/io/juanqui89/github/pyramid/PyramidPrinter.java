package io.juanqui89.github.pyramid;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'

import java.util.Arrays;

public class PyramidPrinter {

  public static void printPytamid(int n) {
    n = (n *2) -1;
    char s[] = new char[n ];
    Arrays.fill(s, ' ');
    int mid = n /2;
    int rStart = mid + 1;
    int lStart = mid -1;

    while (lStart != -1) {
      if (s[mid] ==' ')  s[mid] = '#';
      else {
        s[lStart--] = '#';
        s[rStart++] = '#';
      }
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    PyramidPrinter.printPytamid(5);
  }
}
