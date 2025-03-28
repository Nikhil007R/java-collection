package com.bridgelabz.queue;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Priority Queue with custom comparator (Higher severity comes first)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity) // Max-Heap behavior
        );

        System.out.print("Enter number of patients: ");
        int numPatients = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < numPatients; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();
            System.out.print("Enter severity level: ");
            int severity = sc.nextInt();
            sc.nextLine(); // Consume newline

            triageQueue.offer(new Patient(name, severity));
        }

        System.out.println("\nPatients will be treated in the following order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Process highest severity patient first
        }
    }
}

