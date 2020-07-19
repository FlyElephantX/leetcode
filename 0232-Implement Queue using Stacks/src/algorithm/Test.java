package algorithm;

import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.size() == 0) {
            while (s1.size() > 0) {
                s2.add(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (s2.size() == 0) {
            while (s1.size() > 0) {
                s2.add(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}

public class Test {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("顶部数值:" + queue.peek());
        queue.pop();
        System.out.println("顶部数值:" + queue.peek());
        System.out.println("顶部是否为空:" + queue.empty());
    }
}
