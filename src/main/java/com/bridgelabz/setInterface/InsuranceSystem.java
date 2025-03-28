package com.bridgelabz.setInterface;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    String policyNumber, policyholderName, coverageType;
    LocalDate expiryDate;
    double premiumAmount;

    InsurancePolicy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) obj;
        return policyNumber.equals(that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " + expiryDate + " | " + coverageType + " | $" + premiumAmount;
    }
}

public class InsuranceSystem {
    static HashSet<InsurancePolicy> policySet = new HashSet<>();
    static LinkedHashSet<InsurancePolicy> orderedPolicySet = new LinkedHashSet<>();
    static TreeSet<InsurancePolicy> sortedPolicySet = new TreeSet<>();

    public static void addPolicy(InsurancePolicy policy) {
        policySet.add(policy);
        orderedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }

    public static void displayAllPolicies() {
        System.out.println("\nAll Unique Policies:");
        policySet.forEach(System.out::println);
    }

    public static void displayPoliciesExpiringSoon() {
        System.out.println("\nPolicies Expiring in Next 30 Days:");
        LocalDate today = LocalDate.now();
        sortedPolicySet.stream()
                .filter(p -> p.expiryDate.isBefore(today.plusDays(30)))
                .forEach(System.out::println);
    }

    public static void displayPoliciesByCoverage(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        policySet.stream()
                .filter(p -> p.coverageType.equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    public static void findDuplicatePolicies() {
        System.out.println("\nDuplicate Policies Based on Policy Number:");
        Set<String> seen = new HashSet<>();
        policySet.stream()
                .filter(p -> !seen.add(p.policyNumber))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        addPolicy(new InsurancePolicy("P2001", "Nikhil", "2024-06-05", "Health", 1200.0));
        addPolicy(new InsurancePolicy("P2002", "Pranav", "2024-04-20", "Auto", 900.0));
        addPolicy(new InsurancePolicy("P2003", "Jashan", "2024-05-15", "Home", 1500.0));
        addPolicy(new InsurancePolicy("P2004", "Ayush", "2024-07-10", "Life", 2000.0));
        addPolicy(new InsurancePolicy("P2001", "Nikhil", "2024-06-05", "Health", 1200.0)); // Duplicate

        displayAllPolicies();
        displayPoliciesExpiringSoon();
        displayPoliciesByCoverage("Health");
        findDuplicatePolicies();
    }
}

