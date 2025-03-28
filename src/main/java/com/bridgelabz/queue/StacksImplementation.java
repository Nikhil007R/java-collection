package com.bridgelabz.queue;

import java.util.*;

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

//    push
    public void push(int x) {
        q1.offer(x);
    }

//    pop
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }


        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int topElement = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Top operation (O(N))
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Get the last element
        int topElement = q1.peek();
        q2.offer(q1.poll()); // Move it to q2

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // isEmpty method
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StacksImplementation {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());

    }
}

