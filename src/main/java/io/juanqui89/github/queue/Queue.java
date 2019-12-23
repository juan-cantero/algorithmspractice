package io.juanqui89.github.queue;
// --- Description
// Create a queue data structure.  The queue
// should be a class with methods 'add' and 'remove'.
// Adding to the queue should store an element until
// it is removed
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.remove(); // returns 1;

import java.util.NoSuchElementException;

public class Queue<E> {

  private Node<E> front;
  private Node<E> rear;

  public boolean isEmpty() {
    return rear == null;
  }


  public void add (E e) {
    Node<E> n  = new Node<E>();
    n.setData(e);

    if (this.rear == null) {
      this.rear = n;
      this.front = n;
    }
    else {
       this.front.setNext(n);
       this.front = n;

    }
  }

  public E remove() {

    if (isEmpty()) {
       throw new NoSuchElementException("underflow");
    }
    else {
      E data = rear.getData();
       this.rear = rear.getNext();
       return data;
    }
  }

  public E peek() {
    if (isEmpty()) return null;
    return rear.getData();
  }




}
