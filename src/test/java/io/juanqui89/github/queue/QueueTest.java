package io.juanqui89.github.queue;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QueueTest {

  @Test
  public void testRemove() {
    Queue<Integer> queue = new Queue<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    int expected = queue.remove();
    assertEquals(expected,1);
  }
}