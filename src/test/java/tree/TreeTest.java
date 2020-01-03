package tree;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TreeTest {
  Tree<Integer> tree;
  Tnode<Integer> root;

  @BeforeMethod
  public void setUp() {
    root = new Tnode<>(1);
    tree = new Tree<>(root);
    tree.getRoot().getChildren().add(new Tnode<>(2));
    tree.getRoot().getChildren().add(new Tnode<>(4));
    tree.getRoot().getChildren().get(0).getChildren().add(new Tnode<>(5));
  }

  @Test
  public void testTraverseBf() {
    final List<Integer> l = new ArrayList<>();
    tree.traverseBf(e -> l.add(e));
    Assert.assertEquals(l,Arrays.asList(1,2,4,5));

    /*Queue<Tnode> q = new LinkedList<>();
    q.add(root);
    List<Integer> l = new ArrayList<>();
    while (!q.isEmpty()) {
      l.add((Integer) q.peek().getData());
       q.poll().getChildren().forEach(c -> q.add((Tnode) c));

    }
    l.forEach(System.out::println);*/


  }

  @Test
  public void testTraverseDF() {
    Stack<Tnode> s = new Stack<>();
    s.push(root);
    List<Integer> l = new LinkedList<>();
    List<Tnode> temp;
    while (!s.isEmpty()) {
      l.add((Integer) s.peek().getData());
      temp = s.pop().getChildren();
      for (int i = temp.size() -1; i >= 0 ; i--) {
        s.push(temp.get(i));
      }
    }
    l.forEach(System.out::println);
  }
}