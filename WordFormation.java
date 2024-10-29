package com.coderpadtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFormation {

    public static List<String> findWords(String[] dict, String input) {
        // Step 1: Create a frequency map for the input word
        Map<Character, Integer> inputFreq = getFrequencyMap(input);
        List<String> result = new ArrayList<>();

        // Step 2: Check each word in the dictionary
        for (String word : dict) {
            if (canFormWord(word, inputFreq)) {
                result.add(word); // Add word to result if it can be formed
            }
        }

        return result;
    }

    // Helper function to create a frequency map of characters in a word
    private static Map<Character, Integer> getFrequencyMap(String word) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }

    // Helper function to check if a word can be formed with the input frequency map
    private static boolean canFormWord(String word, Map<Character, Integer> inputFreq) {
        Map<Character, Integer> wordFreq = getFrequencyMap(word);

      
        if(!wordFreq.equals(inputFreq))
        {
        	return false;
        }
        

        return true; // All characters in the word have sufficient occurrences
    }

    public static void main(String[] args) {
        String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input1 = "abcd";
        System.out.println("Words that can be formed: " + findWords(dict1, input1));

        String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input2 = "caab";
        System.out.println("Words that can be formed: " + findWords(dict2, input2));
    }
}
