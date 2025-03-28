package com.bridgelabz.queue;

import java.util.*;

public class BinaryNumber {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < N; i++) {
            String curr = queue.poll();
            result.add(curr);

            queue.offer(curr + "0");
            queue.offer(curr + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of binary numbers to generate: ");
        int N = sc.nextInt();

        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("Generated Binary Numbers: " + binaryNumbers);
    }
}

