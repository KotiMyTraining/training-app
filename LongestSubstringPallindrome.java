package com.practiceafterten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class LongestSubstringPallindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        String result = longestPalindrome(s);
        System.out.println("Longest Palindrome String: " + result); 
        System.out.println("Length of Longest Palindrome: " + result.length());  
    }

    public static String longestPalindrome(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> sortedMap = charCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) 
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, 
                        LinkedHashMap::new));

        StringBuilder leftHalf = new StringBuilder();
        StringBuilder middle = new StringBuilder(); 
        StringBuilder rightHalf = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            
            if (count % 2 == 0) {
                addCharacters(leftHalf, c, count / 2);
            }else {
                addCharacters(leftHalf, c, count / 2);
                if (middle.length() == 0) {
                    middle.append(c);
                }
            }
        }

        rightHalf.append(leftHalf).reverse();
       
        return leftHalf.toString() + middle.toString() + rightHalf.toString();
    }

    // Helper method to append characters to the StringBuilder
    private static void addCharacters(StringBuilder sb, char c, int times) {
        for (int i = 0; i < times; i++) {
            sb.append(c);
        }
    }
}