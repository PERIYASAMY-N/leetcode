import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution {
    // Cache to store the results of previously evaluated string pairs
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        // Base cases
        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;
        
        // Generate a unique key for the map
        String key = s1 + " " + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Pruning: Check if s1 and s2 are anagrams
        if (!isAnagram(s1, s2)) {
            memo.put(key, false);
            return false;
        }

        int n = s1.length();

        // Try splitting the strings at every possible index i
        for (int i = 1; i < n; i++) {
            // Case 1: Substrings are NOT swapped
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) 
                && isScramble(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }

            // Case 2: Substrings ARE swapped
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) 
                && isScramble(s1.substring(i), s2.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    // Helper method to quickly check if character frequencies match
    private boolean isAnagram(String s1, String s2) {
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
