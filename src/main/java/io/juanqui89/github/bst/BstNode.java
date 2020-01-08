package io.juanqui89.github.bst;




public class BstNode<E extends Comparable<E>>  {
  private E data;
  private BstNode<E> left;
  private BstNode<E> rigth;


  public BstNode() {};

  public BstNode(E data) {
    this.data = data;
  }

  public BstNode(E data, BstNode<E> left, BstNode<E> rigth) {
    this.data = data;
    this.left = left;
    this.rigth = rigth;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public BstNode<E> getLeft() {
    return left;
  }

  public void setLeft(BstNode<E> left) {
    this.left = left;
  }

  public BstNode<E> getRigth() {
    return rigth;
  }

  public void setRigth(BstNode<E> rigth) {
    this.rigth = rigth;
  }





}
