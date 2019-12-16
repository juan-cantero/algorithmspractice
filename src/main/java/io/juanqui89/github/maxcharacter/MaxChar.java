package io.juanqui89.github.maxcharacter;


// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MaxChar {

  public static char getMostRepeatedChar(String str) {
    Map<Character, Integer> frequenceChar = new HashMap<>();
    for (int i = 0; i < str.length() ; i++) {
      char key = str.charAt(i);
      frequenceChar.merge(key,1,Integer::sum);
    }
    int max = 0;
    char maxChar = ' ';
    for (Map.Entry<Character,Integer> entry : frequenceChar.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        maxChar = entry.getKey();
      }
    }
    return maxChar;
  }


  public static char maximumOccuringChar(String str) {
    return str.chars()
            .mapToObj(x -> (char) x)                  // box to Character
            .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
            .entrySet().stream()
            .max(comparingByValue())                  // find entry with largest count
            .get()                                    // or throw if source string is empty
            .getKey();
  }






}
