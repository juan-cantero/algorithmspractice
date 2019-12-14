package io.juanqui89.github.reversestring;


import io.juanqui89.github.reversestring.ReverseString;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseStringTest {

  @org.testng.annotations.Test
  public void testReverse() {
    String expected = ReverseString.reverse("apple");
    assertEquals(expected, "elppa");
  }

  @Test
  public void testFastReverse() {
    String expected = ReverseString.fastReverse("hola");
    assertEquals(expected,"aloh");
  }
}