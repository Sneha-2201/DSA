class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int ones = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else if (i == n - 1 || s.charAt(i + 1) == '1') {
                // this zero is the last in its zero-block (or at end) so it contributes
                ans += ones;
            }
        }

        return ans;

        
    }
}