package com.practiceafterten;

import java.util.HashMap;

public class PermutationInSubstring {

    public static void main(String[] args) {
        String input = "abbcdkkaeesrd";
        String searchString = "abc";
        
        findPermutationsInString(input, searchString);
    }

    public static void findPermutationsInString(String input, String searchString) {
        if (input == null || searchString == null || input.length() < searchString.length()) {
            System.out.println("No permutations found.");
            return;
        }
        
        // Create frequency map for the searchString
        HashMap<Character, Integer> searchMap = new HashMap<>();
        for (char c : searchString.toCharArray()) {
            if (searchMap.containsKey(c)) {
                searchMap.put(c, searchMap.get(c) + 1);
            } else {
                searchMap.put(c, 1);
            }
        }
        
        int windowSize = searchString.length();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        
        // Traverse the input string with a sliding window
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Add current character to the window map
            if (windowMap.containsKey(currentChar)) {
                windowMap.put(currentChar, windowMap.get(currentChar) + 1);
            } else {
                windowMap.put(currentChar, 1);
            }
            
            // Remove the character that's outside the window
            if (i >= windowSize) {
                char charToRemove = input.charAt(i - windowSize);
                if (windowMap.containsKey(charToRemove)) {
                    if (windowMap.get(charToRemove) == 1) {
                        windowMap.remove(charToRemove);
                    } else {
                        windowMap.put(charToRemove, windowMap.get(charToRemove) - 1);
                    }
                }
            }
            
            // Compare the current window's frequency map with the searchString map
            if (windowMap.equals(searchMap)) {
                System.out.println("Permutation found at index: " + (i - windowSize + 1) + " -> " + input.substring(i - windowSize + 1, i + 1));
            }
        }
    }
}