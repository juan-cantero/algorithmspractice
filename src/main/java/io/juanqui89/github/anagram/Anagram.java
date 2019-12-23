package io.juanqui89.github.anagram;
// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Anagram {

  public static boolean isAnagram(String str1, String str2) {

    str1 = str1.replaceAll("[\\s\\W]", "").toLowerCase();
    str2 = str2.replaceAll("[\\s\\W]", "").toLowerCase();

    String sorted1 = Stream.of(str1.split(""))
                      .sorted()
                       .collect(joining());

    String sorted2 = Stream.of(str2.split(""))
            .sorted()
            .collect(joining());


    return sorted1.equals(sorted2);

  }


  public static void main(String[] args) {
    System.out.println(Anagram.isAnagram("rail safety","fairy! tales"));
  }

}
