package io.juanqui89.github.bst;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BstTest {
  Bst<Integer> bst;
  BstNode<Integer> root;

  @BeforeMethod
  public void setUp() {
    root = new BstNode<>(10);
    bst = new Bst<>(root);
    bst.add(8);
    bst.add(12);
  }

  @Test
  public void testAdd() {
    bst.add(7);
    int inserted = bst.getRoot().getLeft().getLeft().getData();
    assertEquals(inserted,7);

  }

  @Test
  public void testContains() {
    assertTrue(bst.contains(8));
    assertFalse(bst.contains(88));
  }
}