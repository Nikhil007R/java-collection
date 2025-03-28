package com.bridgelabz.listInterface;

import java.util.*;

public class Reverse {

    public static void reverseArrayList(ArrayList<Integer> arr){
        int s = 0;
        int e = arr.size() - 1;

        while(s < e){
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
    }
    public static void reverseLinkedlist(LinkedList<Integer> arr){
        int s = 0;
        int e = arr.size() - 1;

        while(s < e){
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Enter element size");
        int size = sc.nextInt();

        System.out.println("Enter your elements here: ");
        for(int i=0; i<size; i++){
            arrList.add(sc.nextInt());
        }

        System.out.println("Arraylist before Reversing: ");
        System.out.println(arrList);

        reverseArrayList(arrList);
        System.out.println("Arraylist After Reversing: ");
        System.out.println(arrList);

        LinkedList<Integer> linkedlist = new LinkedList<>();
        System.out.println("Enter element size");
        int size1 = sc.nextInt();

        System.out.println("Enter your elements here: ");
        for(int i=0; i<size1; i++){
            linkedlist.add(sc.nextInt());
        }

        System.out.println("Linkedlist before Reversing: ");
        System.out.println(linkedlist);

        reverseLinkedlist(linkedlist);
        System.out.println("Linkedlist After Reversing: ");
        System.out.println(linkedlist);

    }
}
