package io.juanqui89.github.stack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class StackTest {
  Stack<Integer> stack;

  @BeforeTest
  public void setUp() {
    stack = new Stack<>();

  }

  @Test
  public void testPush() {
    List<Integer> l = new LinkedList<>();
    //stack.push(1);
    //stack.push(2);
    stack.push(1);
    stack.push(2);
    l.add(stack.pop());
    l.add(stack.pop());

    assertEquals(l, Arrays.asList(2,1));

  }

  public void testPop() {
    stack.push(33);
    assertEquals(java.util.Optional.ofNullable(stack.peek()),33);
  }
}