package io.juanqui89.github.linklist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

import static org.testng.Assert.*;

public class MyLinkListTest {
  MyLinkList<Integer> list;

  @BeforeMethod
  public void setUp() {
    list = new MyLinkList<>();

  }
  @Test
  public void testIsEmpty() {
    assertTrue(list.isEmpty());
  }

  @Test
  public void testInsertFirst() {
    list.insertFirst(3);
    list.insertFirst(5);
    Optional<Integer> first = list.getFirst();
    assertEquals(first, Optional.of(5));
  }

  @Test

  public void testInsertLast() {
    list.insertLast(77);
    list.insertLast(99);
    Optional<Integer> last = list.getLast();
    assertEquals(last, Optional.of(99));
  }


  @Test
  public void testForEach() {
    MyLinkList<Integer> ml = new MyLinkList<>();
    ml.insertFirst(1);
    ml.insertFirst(2);
    ml.insertFirst(3);
    ml.insertLast(4);
    LinkedList<Integer> expected = new LinkedList<>();
    ml.forEach(e -> expected.add(e));
    assertEquals(expected,Arrays.asList(3,2,1,4));
  }

  @Test
  public void clear() {
    list.insertLast(2);
    list.insertLast(2);
    list.insertLast(2);
    list.insertLast(2);
    list.clear();
    int expectedSize = list.getSize();
    assertEquals(expectedSize,0);
  }

  @Test
  public void testRemoveFirst() {
    MyLinkList<Integer> ml = new MyLinkList<>();
    ml.insertFirst(1);
    ml.insertFirst(2);
    ml.insertFirst(3);
    ml.insertLast(4);

    ml.removeFirst();

    assertEquals(ml.toArray(),Arrays.asList(2,1,4));
  }
  @Test
  public void testGetAt() {
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    int expected = list.getAt(2);
    assertEquals(expected,4);
  }

  @Test
  public void testRemoveAt() {
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    int removed = list.removeAt(0);
    System.out.println(list.toArray());
    assertEquals(removed, 2);

  }

  @Test
  public void testMidPoint() {
    list.insertLast(2);
    //list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    list.insertLast(6);
    int mid = list.getMidPoint();
    assertEquals(mid, 4);

  }

  @Test
  public void testGetFromLast() {
    list.insertLast(1);
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    list.insertLast(6);
    list.insertLast(7);
    int nFromLast = list.getFromLast(5);
    assertEquals(nFromLast, 2);
  }

}