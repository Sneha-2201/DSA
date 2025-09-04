class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add one and return
                return digits;
            }
            digits[i] = 0;  // if digit is 9, make it 0 and continue loop
        }
        
        // If we are here, all digits were 9 (e.g. 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1;  // first digit is 1, rest are already 0
        return result;

        
    }
}