package tree;
// --- Directions
// 1) Create a node class.  The constructor
// should accept an argument that gets assigned
// to the data property and initialize an
// empty array for storing children. The node
// class should have methods 'add' and 'remove'.
// 2) Create a tree class. The tree constructor
// should initialize a 'root' property to null.
// 3) Implement 'traverseBF' and 'traverseDF'
// on the tree class.  Each method should accept a
// function that gets called with each element in the tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
      q.poll().getChildren().forEach(c -> q.add((Tnode) c));
    }
  }

}
