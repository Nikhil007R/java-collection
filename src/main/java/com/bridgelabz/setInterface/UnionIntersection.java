package com.bridgelabz.setInterface;

import java.util.*;

public class UnionIntersection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs1 = new HashSet<>();

        System.out.println("Enter set1 size");
        int size1 = sc.nextInt();

        System.out.println("Elements of sets are: ");
        for(int i=0; i<size1; i++) {
            hs1.add(sc.nextInt());
        }

        HashSet<Integer> hs2 = new HashSet<>();
        System.out.println("Enter set2 size");
        int size2 = sc.nextInt();
        System.out.println("Elements of sets are: ");
        for(int i=0; i<size2; i++){
            hs2.add(sc.nextInt());
        }

        System.out.println("Union of sets are: ");
        HashSet<Integer> Union = new HashSet<>(hs1);
        Union.addAll(hs2);

        System.out.println("Union set: " + Union);

        HashSet<Integer> Intersetion = new HashSet<>(hs1);
        Intersetion.retainAll(hs2);
        System.out.println("Intersection set: " + Intersetion);

    }
}
