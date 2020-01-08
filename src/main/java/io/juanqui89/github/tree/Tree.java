package io.juanqui89.github.tree;
// --- Directions
// 1) Create a node class.  The constructor
// should accept an argument that gets assigned
// to the data property and initialize an
// empty array for storing children. The node
// class should have methods 'add' and 'remove'.
// 2) Create a io.juanqui89.github.tree class. The io.juanqui89.github.tree constructor
// should initialize a 'root' property to null.
// 3) Implement 'traverseBF' and 'traverseDF'
// on the io.juanqui89.github.tree class.  Each method should accept a
// function that gets called with each element in the io.juanqui89.github.tree

import java.util.*;
import java.util.function.Consumer;

public class Tree<E> {
  private Tnode<E> root;

  public Tree(Tnode<E> node) {
    root = node;
  }

  public Tnode<E> getRoot() {
    return root;
  }

  public void traverseBf(Consumer<E> consumer) {
    Queue<Tnode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      consumer.accept((E) q.peek().getData());
      List<E> tempChildren =  q.poll().getChildren();
      tempChildren.forEach(c -> q.add((Tnode) c));
    }
  }

  public void traverseDF(Consumer<E> consumer) {
    Stack<Tnode> s = new Stack<>();
    s.push(root);
    List<E> l = new LinkedList<>();
    List<Tnode> temp;
    while (!s.isEmpty()) {
      E data = (E) s.peek().getData();
      l.add(data);
      temp = s.pop().getChildren();
      for (int i = temp.size() -1; i >= 0 ; i--) {
        s.push(temp.get(i));
      }
    }
    l.forEach(e -> consumer.accept(e));
  }

}
