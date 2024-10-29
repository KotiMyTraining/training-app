package com.coderpadtest;

public class SmallestMissingInteger {

    public static int findSmallestMissing(int[] arr) {
        int n = arr.length;

        // Step 1: Calculate the expected sum for numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Step 3: The smallest missing integer is the difference
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        System.out.println("Smallest missing integer: " + findSmallestMissing(arr1)); // Output: 0

        int[] arr2 = {0, 1, 3, 4};
        System.out.println("Smallest missing integer: " + findSmallestMissing(arr2)); // Output: 2
    }
}
