class Solution {
    public int firstUniqChar(String s) {int[] freq = new int[26];  // count frequency of characters
        
        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;

        
    }
}