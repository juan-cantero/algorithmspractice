package io.juanqui89.github.maxcharacter;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxCharTest {

  @Test
  public void testMaximumOccuringChar() {
    char expected = MaxChar.maximumOccuringChar("aabbccccdeeff");
    assertEquals(expected, 'c');
  }
}