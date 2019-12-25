package io.juanqui89.github.queuefromstack;

// --- Directions
// Implement a Queue datastructure using two stacks.
// *Do not* create an array inside of the 'Queue' class.
// Queue should implement the methods 'add', 'remove', and 'peek'.
// For a reminder on what each method does, look back
// at the Queue exercise.
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.peek();  // returns 1
//     q.remove(); // returns 1
//     q.remove(); // returns 2

import java.util.Stack;

public class QFromS {

  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> s2 = new Stack<>();

  public void push(int n) {
    s1.push(n);
  }

  public int peek() {
    return s1.peek();
  }

  public int pop() {
    while (!s1.isEmpty()) s2.push(s1.pop());
    int temp = s2.pop();
    while (!s2.isEmpty()) s1.push(s2.pop());
    return temp;
  }

}
