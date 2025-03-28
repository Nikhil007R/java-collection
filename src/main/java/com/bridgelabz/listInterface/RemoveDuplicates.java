package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();

        System.out.println("Enter your elements: ");
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<size; i++){
            arrList.add(sc.nextInt());
        }

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arrList.size(); i++){
            if(!hs.contains(arrList.get(i))) {
                hs.add(arrList.get(i));
            }
            else{
                arrList.remove(i);
                i--;
            }
        }
        System.out.println("Elements after removing duplicates. ");
        System.out.println(arrList);
    }
}
