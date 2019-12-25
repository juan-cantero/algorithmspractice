package io.juanqui89.github.stack;
// --- Directions
// Create a stack data structure.  The stack
// should be a class with methods 'push', 'pop', and
// 'peek'.  Adding an element to the stack should
// store it until it is removed.
// --- Examples
//   const s = new Stack();
//   s.push(1);
//   s.push(2);
//   s.pop(); // returns 2
//   s.pop(); // returns 1

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<E> {
  private Node<E> top;

  public void push(E e) {
    Node<E> node = new Node<>(e);
    node.next = top;
    top = node;
  }

  public E pop() {
    E data = peek();
   top = top.next;
   return data;
  }

  public E peek() {
    if (top == null) throw new EmptyStackException();
    return top.getData();
  }

}
