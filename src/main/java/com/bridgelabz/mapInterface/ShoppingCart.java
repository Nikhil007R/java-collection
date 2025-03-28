package com.bridgelabz.mapInterface;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter items and (Item Price):");
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            cart.put(input[0], Integer.parseInt(input[1]));
        }

        LinkedHashMap<String, Integer> orderedCart = new LinkedHashMap<>(cart);

        TreeMap<String, Integer> sortedCart = new TreeMap<>(Comparator.comparingInt(cart::get));
        sortedCart.putAll(cart);

        System.out.println("\nCart (Insertion Order): " + orderedCart);
        System.out.println("Cart (Sorted by Price): " + sortedCart);
    }
}

