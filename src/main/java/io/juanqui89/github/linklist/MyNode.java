package io.juanqui89.github.linklist;

public class MyNode<E> {
  private E element;

  private MyNode<E> next;
  private MyNode<E> previous;

  public MyNode(E e) {
    this.element = e;
  }

  public E getElement() {
    return element;
  }

  public void setElement(E e) {
    this.element = e;
  }

  public MyNode<E> getNext() {
    return next;
  }

  public void setNext(MyNode<E> next) {
    this.next = next;
  }

  public MyNode<E> getPrevious() {
    return previous;
  }

  public void setPrevious(MyNode<E> previous) {
    this.previous = previous;
  }
}
