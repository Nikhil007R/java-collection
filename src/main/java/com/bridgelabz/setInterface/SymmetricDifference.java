package com.bridgelabz.setInterface;

import java.util.*;

public class SymmetricDifference {

    public static HashSet<Integer> findSymmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> union = new HashSet<>(set1);      // Copy set1
        union.addAll(set2);                               // Union with set2

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);                     // Intersection of set1 & set2

        union.removeAll(intersection);                    // Remove intersection from union
        return union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.println("Enter size of Set 1:");
        int size1 = sc.nextInt();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < size1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Enter size of Set 2:");
        int size2 = sc.nextInt();
        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < size2; i++) {
            set2.add(sc.nextInt());
        }

        HashSet<Integer> symmetricDiff = findSymmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}

