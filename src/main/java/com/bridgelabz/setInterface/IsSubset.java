package com.bridgelabz.setInterface;

import java.util.*;

class IsSubset {
    public static boolean isSubset(HashSet<Integer> s1, HashSet<Integer> s2) {
        return s1.containsAll(s2) || s2.containsAll(s1);
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

        boolean result = isSubset(set1, set2);
        System.out.println(result?"one set is a subset of Another. ":"No Subset. ");
    }
}

