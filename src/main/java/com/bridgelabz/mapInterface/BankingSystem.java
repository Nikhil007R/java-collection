package com.bridgelabz.mapInterface;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<Integer, Double> accounts = new HashMap<>();
        Queue<Integer> withdrawalQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Adding some accounts
        accounts.put(101, 5000.0);
        accounts.put(102, 3000.0);
        accounts.put(103, 7000.0);

        // Withdrawal Requests
        withdrawalQueue.add(101);
        withdrawalQueue.add(103);
        withdrawalQueue.add(102);

        // Sorting accounts by balance
        TreeMap<Integer, Double> sortedAccounts = new TreeMap<>(Comparator.comparingDouble(accounts::get));
        sortedAccounts.putAll(accounts);

        System.out.println("Accounts (Sorted by Balance): " + sortedAccounts);
        System.out.println("\nProcessing Withdrawals:");

        while (!withdrawalQueue.isEmpty()) {
            int accNum = withdrawalQueue.poll();
            if (accounts.containsKey(accNum)) {
                System.out.println("Processing withdrawal for Account: " + accNum);
            }
        }
    }
}

