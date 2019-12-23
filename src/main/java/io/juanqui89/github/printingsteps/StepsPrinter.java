package io.juanqui89.github.printingsteps;
// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

import java.util.Arrays;

public class StepsPrinter {

  public static void printSteps(int n) {
    char s [] = new char[n];
    Arrays.fill(s,' ');
    for (int i = 0; i < n; i++){
      s[i] = '#';
      System.out.println(s);
    }


  }

  public static void main(String[] args) {
    StepsPrinter.printSteps(5);
  }



}
