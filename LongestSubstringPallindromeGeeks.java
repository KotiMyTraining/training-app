package com.practiceafterten;

public class LongestSubstringPallindromeGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String input="forgeeksskeegfor";
	
	String result=  longestPalindrome( input);
	
	System.out.println("the longest pallindrome is " +result);

	}

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome (center at i)
            int len1 = expandAroundCenter(s, i, i);
            // Case 2: Even length palindrome (center between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get the maximum of the two lengths
            int len = Math.max(len1, len2);

            // If a new longer palindrome is found, update the start and end
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the substring from the start to the end index
        return s.substring(start, end + 1);
    }

    // Helper method to expand around the center
    private static int expandAroundCenter(String s, int left, int right) {
        // Expand as long as characters on both sides are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Return the length of the palindrome
        return right - left - 1;
    }

		
		
	

}
