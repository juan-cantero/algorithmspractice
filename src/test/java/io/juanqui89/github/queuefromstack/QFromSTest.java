package io.juanqui89.github.queuefromstack;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QFromSTest {

  @Test
  public void testPop() {
    QFromS q = new QFromS();
    q.push(1);
    q.push(2);
    q.push(3);
    assertEquals(q.pop(),1);
  }
}