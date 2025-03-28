package com.bridgelabz.listInterface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int N) {
        if (list.isEmpty() || N <= 0) {
            return "Invalid input";
        }

        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Move first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return "N is larger than the size of the list";
            }
            first.next();
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.next());
        }

        System.out.println("Enter N (position from end): ");
        int N = sc.nextInt();

        System.out.println("Nth element from end: " + findNthFromEnd(list, N));
    }
}

