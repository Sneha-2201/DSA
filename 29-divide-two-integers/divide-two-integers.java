class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Handle same number case
        if (dividend == divisor) return 1;

        // Determine sign
        boolean isPositive = (dividend >= 0 && divisor >= 0) || (dividend < 0 && divisor < 0);

        // Work with absolute values as long
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

        while (n >= d) {
            int count = 0;

            // Find the highest shift count where (d << (count + 1)) <= n
            while (n >= (d << (count + 1))) {
                count++;
            }

            // Add 1 << count to the answer
            ans += 1 << count;

            // Subtract d * (1 << count) from n
            n -= d * (1L << count);  // Cast to long to avoid overflow
        }

        return isPositive ? ans : -ans;

        
    }
}