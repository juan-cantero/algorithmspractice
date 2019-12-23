package io.juanqui89.github.arraychunking;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class ChunkerTest {

  @Test
  public void testChunck() {
    List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);
    List<List<Integer>> actual = Chunker.chunck(list,4);
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(2,3,4,5),Arrays.asList(6,7,8,9));
    assertEquals(expected,actual );
  }
}