package com.bridgelabz.listInterface;

import java.util.*;

public class Frequency {

    public static HashMap<String, Integer> getFrequency(ArrayList<String> arrList){

        HashMap<String, Integer> hm = new HashMap<>();
        int size = arrList.size();

        for(int i=0; i<size; i++){
            if(!hm.containsKey(arrList.get(i))){
                hm.put(arrList.get(i), 1);
            }
            else{
                hm.put(arrList.get(i), hm.get(arrList.get(i)) + 1);
            }
        }
        return hm;
    }

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>();

        System.out.println("Enter size of arraylist ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Entering elements: ");

        for(int i=0; i<size; i++){
            arrList.add(sc.next());
        }

        System.out.println("Frequency Table: ");
        System.out.println(getFrequency(arrList));
    }
}
