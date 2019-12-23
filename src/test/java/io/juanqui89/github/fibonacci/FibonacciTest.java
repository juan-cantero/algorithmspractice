package io.juanqui89.github.fibonacci;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FibonacciTest {

  @Test
  public void testGetFibonacciOf() {
    int expected = Fibonacci.fib(5);
    assertEquals(expected,5);
  }
}