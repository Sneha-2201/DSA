class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" "); // step 1
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse(); // step 2
            result.append(sb); // step 3
            if (i < words.length - 1) result.append(" "); // step 4
        }

        return result.toString();

    }
}