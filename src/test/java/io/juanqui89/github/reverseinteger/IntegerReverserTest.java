package io.juanqui89.github.reverseinteger;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegerReverserTest {

  @Test
  public void testReverseNumber() {
    int expected = IntegerReverser.reverseNumber(-51);
    assertEquals(expected, -15);
  }
}