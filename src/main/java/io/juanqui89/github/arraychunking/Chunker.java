package io.juanqui89.github.arraychunking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

public class Chunker {

  public static List<List<Integer>> chunck(List<Integer>l, int large) {
    List<List<Integer>> chunked = new ArrayList<>();
    int first = 0;
    int last = 0;
    while (first < l.size()){
      last = (first + large) > l.size() ? l.size() : large + first;
      chunked.add(l.subList(first,last ));
      first += large;
    }
    return chunked;
  }



}
