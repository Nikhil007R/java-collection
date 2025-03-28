package com.bridgelabz.setInterface;

import java.util.*;

public class SetToSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> set1 = new TreeSet<>();

        System.out.println("Enter size of Set 1:");
        int size1 = sc.nextInt();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < size1; i++) {
            set1.add(sc.nextInt());
        }

        ArrayList<Integer> arr = new ArrayList<>(set1);
        System.out.println(arr);


    }
}
