package com.bridgelabz.queue;

import java.util.*;

public class CircularBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int bufferSize = sc.nextInt();
        Queue<Integer> buffer = new ArrayDeque<>(bufferSize);

        System.out.println("Enter number of operations:");
        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            System.out.print("Enter operation (1=enqueue, 2=dequeue, 3=display): ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter value to enqueue: ");
                int value = sc.nextInt();
                if (buffer.size() == bufferSize) {
                    buffer.poll();
                }
                buffer.offer(value);
            } else if (op == 2) {
                if (!buffer.isEmpty()) {
                    System.out.println("Dequeued: " + buffer.poll());
                } else {
                    System.out.println("Buffer is empty.");
                }
            } else if (op == 3) {
                System.out.println("Buffer: " + buffer);
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
