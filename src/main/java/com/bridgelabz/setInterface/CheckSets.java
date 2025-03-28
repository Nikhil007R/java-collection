package com.bridgelabz.setInterface;

import java.util.*;


public class CheckSets {

    public static boolean isEqual(HashSet<Integer> hs1, HashSet<Integer> hs2){

        if(hs1.size() != hs2.size()){
            return false;
        }

        return hs1.equals(hs2);
    }

    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of set 1");
        int size1 = sc.nextInt();
        System.out.println("Elements are: ");
        for(int i=0; i<size1; i++){
            hs1.add(sc.nextInt());
        }

        System.out.println("Enter the size of set 2");
        int size2 = sc.nextInt();
        System.out.println("Elements are: ");
        for(int i=0; i<size2; i++){
            hs2.add(sc.nextInt());
        }

        if(isEqual(hs1, hs2)){
            System.out.println("Sets are equal: ");
        }else{
            System.out.println("Sets are not equal:  ");
        }

    }
}
