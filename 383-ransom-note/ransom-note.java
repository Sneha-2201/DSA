class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // step 1: to store a-z frequency

        // step 2: count frequency in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // step 3: check for ransomNote letters
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false; // not enough of this char
            }
        }

        return true; // all letters are available

        
    }
}