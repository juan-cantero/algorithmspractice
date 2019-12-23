package io.juanqui89.github.capitalize;
// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capitalize {
  public static String capitalizeFirst(String str) {
    return Stream.of(str.split(" "))
            .map(s -> s.substring(0,1).toUpperCase().concat(s.substring(1)))
            .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(Capitalize.capitalizeFirst("!hola mundo"));
  }
}
