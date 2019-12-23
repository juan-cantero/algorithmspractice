package io.juanqui89.github.weave;

// --- Directions
// 1) Complete the task in weave/queue.js
// 2) Implement the 'weave' function.  Weave
// receives two queues as arguments and combines the
// contents of each into a new, third queue.
// The third queue should contain the *alterating* content
// of the two queues.  The function should handle
// queues of different lengths without inserting
// 'undefined' into the new one.
// *Do not* access the array inside of any queue, only
// use the 'add', 'remove', and 'peek' functions.
// --- Example
//    const queueOne = new Queue();
//    queueOne.add(1);
//    queueOne.add(2);
//    const queueTwo = new Queue();
//    queueTwo.add('Hi');
//    queueTwo.add('There');
//    const q = weave(queueOne, queueTwo);
//    q.remove() // 1
//    q.remove() // 'Hi'
//    q.remove() // 2
//    q.remove() // 'There'

import io.juanqui89.github.queue.Queue;

import java.util.LinkedList;
import java.util.List;

public class Weave {
  public Queue<Integer> weave(Queue<Integer> q1, Queue<Integer> q2) {
    Queue<Integer> result = new Queue<>();
    while (!q1.isEmpty() || !q2.isEmpty()) {
      if (q1.peek() != null)
        result.add(q1.remove());
      if (q2.peek() != null)
        result.add(q2.remove());
    }
    return result;
  }

  public static void main(String[] args) {
    Weave w = new Weave();
    Queue<Integer> q1 = new Queue<>();
    Queue<Integer> q2 = new Queue<>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q2.add(44);
    q2.add(55);
    q2.add(999);
    q2.add(999);



    Queue<Integer> result  = w.weave(q1,q2);
    while (!result.isEmpty())
      System.out.println(result.remove());

  }
}
