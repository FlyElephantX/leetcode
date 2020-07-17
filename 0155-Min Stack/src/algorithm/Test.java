package algorithm;

import java.awt.print.Pageable;
import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */

    Stack<Integer> normalStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {

    }

    public void push(int x) {
        normalStack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            if (x <= minStack.peek()) {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        int top = normalStack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return normalStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class Test {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("最小值:" + minStack.getMin());
        minStack.pop();
        System.out.println("顶部值:" + minStack.top());
        minStack.top();
        System.out.println("最小值:" + minStack.getMin());
    }
}
