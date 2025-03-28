package com.bridgelabz.mapInterface;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        // File path
        String filePath = "input.txt"; // Change this to the path of your file

        // HashMap to store word frequency
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                // Split line into words
                String[] words = line.split("\\s+");

                // Count word frequency
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Print word frequency
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

