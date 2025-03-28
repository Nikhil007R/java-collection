package com.bridgelabz.listInterface;

import java.util.*;

public class Rotate {

    public static void reverse(int s, int e, ArrayList<Integer> arr){
        while(s < e){
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
    }

    public static void rotateList(ArrayList<Integer> arr, int pos){

        int size = arr.size();
        reverse(0, pos-1, arr);
        reverse(pos, size-1, arr);
        reverse(0, size-1, arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();

        System.out.println("Enter your elements: ");
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<size; i++){
            arrList.add(sc.nextInt());
        }

        System.out.println("Enter from where you need to rotate: It should be less than size ");
        int pos = sc.nextInt();

        rotateList(arrList, pos);
//        reverse(0, 2, arrList);
        System.out.println(arrList);

    }
}
