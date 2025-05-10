package PermutationLeatCodeProgram;

/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"   
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.*/


public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        
        // If s1 is longer than s2, s2 can't contain a permutation of s1
        if (lenS1 > lenS2) {
            return false;
        }

        // Frequency count for s1
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Initialize the counts for s1 and the first window of s2
        for (int i = 0; i < lenS1; i++) {
           s1Count[s1.charAt(i) - 'a']++;
           windowCount[s2.charAt(i) - 'a']++;
        }

        // Compare initial window with s1's frequency count
        if (matches(s1Count, windowCount)) {
            return true;
        }

        // Start sliding the window
        for (int i = lenS1; i < lenS2; i++) {
            // Add the new character to the window
            windowCount[s2.charAt(i) - 'a']++;
            // Remove the old character from the window
            windowCount[s2.charAt(i - lenS1) - 'a']--;

            // Check if the updated window matches s1's frequency count
            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        // No matching window found
        return false;
    }

    // Helper function to check if two frequency arrays are the same
    private boolean matches(int[] s1Count, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != windowCount[i]) {
                return false;
            }
        }
        return true;
    }
}



