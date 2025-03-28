package com.bridgelabz.queue;

import java.util.*;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter the size of the queue:");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < size; i++) {
            queue.offer(sc.nextInt());
        }

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

