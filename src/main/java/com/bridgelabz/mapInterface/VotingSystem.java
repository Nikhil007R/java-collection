package com.bridgelabz.mapInterface;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter votes (Candidate Name):");
        for (int i = 0; i < n; i++) {
            String candidate = sc.nextLine();
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        // Preserve order of votes
        LinkedHashMap<String, Integer> orderedVotes = new LinkedHashMap<>(votes);

        // Display sorted results
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(votes);

        System.out.println("\nVotes (Insertion Order): " + orderedVotes);
        System.out.println("Votes (Sorted Order): " + sortedVotes);
    }
}

