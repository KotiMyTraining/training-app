package com.coderpadtest;

import java.math.BigInteger;

public class SimplestFormAfterFractionAdditionTwentyOne {

    public static int[] addFractions(int num1, int den1, int num2, int den2) {
        // Calculate Least Common Denominator (LCD)
        int lcd = lcm(den1, den2);

        // Adjust numerators to the common denominator
        int adjustedNum1 = num1 * (lcd / den1);
        int adjustedNum2 = num2 * (lcd / den2);

        // Sum the adjusted numerators
        int numeratorSum = adjustedNum1 + adjustedNum2;

        // Simplify the result
        int gcd = gcd(numeratorSum, lcd);
        int simplifiedNumerator = numeratorSum / gcd;
        int simplifiedDenominator = lcd / gcd;

        return new int[]{simplifiedNumerator, simplifiedDenominator};
    }

    // Helper function to calculate LCM
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Helper function to calculate GCD
    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    public static void main(String[] args) {
        // Test case 1
        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println("Numerator: " + result1[0] + ", Denominator: " + result1[1]);  // Expected output: 2/3

        // Test case 2
        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println("Numerator: " + result2[0] + ", Denominator: " + result2[1]);  // Expected output: 2/1
    }
}
