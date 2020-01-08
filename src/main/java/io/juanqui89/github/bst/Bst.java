package io.juanqui89.github.bst;

import io.juanqui89.github.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// --- Directions
// 1) Implement the Node class to create
// a binary search tree.  The constructor
// should initialize values 'data', 'left',
// and 'right'.
// 2) Implement the 'insert' method for the
// Node class.  Insert should accept an argument
// 'data', then create an insert a new node
// at the appropriate location in the tree.
// 3) Implement the 'contains' method for the Node
// class.  Contains should accept a 'data' argument
// and return the Node in the tree with the same value.
// If the value isn't in the tree return null.
public class Bst<E extends Comparable<E>> {
  private BstNode<E> root;
  List<E> l = new ArrayList<>();


  public Bst(BstNode<E> root) {
    this.root = root;
  }

  public BstNode<E> getRoot() {
    return root;
  }

  public boolean contains(E e) {
    BstNode current = root;
    boolean found = false;
    while(current != null) {
      if (current.getData().compareTo(e) < 0) current = current.getRigth();
      else if (current.getData().compareTo(e) > 0) current = current.getLeft();
      else {found = true; break;}
    }
    return found;
  }

  public void add(E e) {
    if (root == null) {
      root.setData(e);
      return;
    }
    BstNode<E> parent = null;
    BstNode<E> current = root;

    while (current != null) {
      if (current.getData().compareTo(e) < 0) {
        parent = current;
        current = current.getRigth();
      } else if (current.getData().compareTo(e) > 0) {
        parent = current;
        current = current.getLeft();
      } else return;
    }
      if (parent.getData().compareTo(e) < 0) parent.setRigth(new BstNode<>(e));
      else parent.setLeft(new BstNode<>(e));



  }

  public void isBinaryTree(BstNode<E> root,List<E> l,boolean is) {
    if (root == null) return;
    isBinaryTree(root.getLeft(),l,is);
    l.add(root.getData());



  }

  public void printTree(BstNode<E> root) {
    if (root == null) return;
    printTree(root.getLeft());
    System.out.println(root.getData());
    printTree(root.getRigth());

  }


}
