package algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size() -1; i++){
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

class MyStack2 {
    Queue<Integer> queue1 = new LinkedList<>();    //队列1
    Queue<Integer> queue2 = new LinkedList<>();    //队列2

    // Push element x onto stack.
    public void push(int x) {
        if (!queue2.isEmpty()) {
            queue2.offer(x);
        } else {
            queue1.offer(x);
        }
    }

    // Removes the element on top of the stack.
    public int pop() {
        if (!this.empty()) {
            if (queue1.isEmpty()) {
                while (queue2.size() > 1) {
                    queue1.offer(queue2.poll());
                }
                return queue2.poll();
            } else {
                while (queue1.size() > 1) {
                    queue2.offer(queue1.poll());
                }
                return queue1.poll();
            }
        }
        return -1;
    }

    // Get the top element.
    public int top() {
        if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            int x = queue2.poll();
            queue1.offer(x);
            return x;
        } else {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int x = queue1.poll();
            queue2.offer(x);
            return x;
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}


public class Test {

    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("顶部的数值:" +  stack.top());// returns 2
        System.out.println("pop的数值:" +  stack.pop());// returns 2
        System.out.println("pop的数值:" +  stack.empty());// returns false
    }
}
