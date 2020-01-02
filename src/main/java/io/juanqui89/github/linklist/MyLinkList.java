package io.juanqui89.github.linklist;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Consumer;

public class MyLinkList<E> {

  private MyNode<E> head;
  private MyNode<E> tail;
  private int size;

  public boolean isEmpty() {
    return head == null;
  }
  public void insertFirst(E e) {
    MyNode<E> node = new MyNode<>(e);
    if (this.isEmpty()) {
      head = node;
      tail = node;

   }
    else {
      node.setNext(head);
      head.setPrevious(node);
      head = node;
    }
    size++;
  }

  public E removeFirst() {
    E e = head.getElement();
    head = head.getNext();
    head.getPrevious().setNext(null);
    head.setPrevious(null);
    return e;

  }

  public E removeLast() {
    E e = tail.getElement();
    tail.getPrevious().setNext(tail.getNext());
    tail.setPrevious(null);
    return e;
  }

  public Optional<E> getFirst() {
      return Optional.ofNullable(head.getElement());
  }

  public void insertLast(E e) {
    MyNode<E> node = new MyNode<>(e);
    if (isEmpty()) {
      insertFirst(e);
    }
    else {
      node.setPrevious(tail);
      tail.setNext(node);
      tail = tail.getNext();
      size++;
    }

  }

  public Optional<E> getLast() {
    return Optional.ofNullable(tail.getElement());
  }

  public void forEach(Consumer<E> consumer) {
    MyNode<E> current = head;
    while (current != null) {
      consumer.accept(current.getElement());
      current = current.getNext();
    }

  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;

  }

  public int getSize() {
    return size;
  }

  public LinkedList<E> toArray() {
    LinkedList<E> array = new LinkedList<>();
    int i = 0;
    while (head != null) {
      array.add(head.getElement());
      head = head.getNext();

    }
    return array;
  }

  public E getAt(int index) {
    if (index > size -1) index = size-1;
    MyNode<E> current = head;
    E data = current.getElement();
    for (int i = 0; i < index ; i++) {
      current = current.getNext();
      data = current.getElement();
    }
    return data;
  }

  public E removeAt(int index) {
    if (index > size -1) index = size-1;
    MyNode<E> current = head;
    E e = current.getElement();
    if (index == 0) {
      e = removeFirst();
    }
    else if (index == size -1) {
      e = removeLast();
    }
    else {
      for (int i = 0; i < index; i++) {
        current = current.getNext();
      }
      e = current.getElement();
      current.getPrevious().setNext(current.getNext());
      current.getNext().setPrevious(current.getPrevious());

    }
    return e;


  }

  public E getMidPoint() {
    MyNode<E> slow = head;
    MyNode<E> fast = head;
    while (fast.getNext() != null && fast.getNext().getNext() != null) {
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    return slow.getElement();
  }

  public E getFromLast(int n) {
    MyNode<E> slow = head;
    MyNode<E> fast = slow;

    for (int i = 0; i < n; i++) fast = fast.getNext();

    while (fast != tail) {
      slow = slow.getNext();
      fast = fast.getNext();
    }
    return slow.getElement();
  }




}
