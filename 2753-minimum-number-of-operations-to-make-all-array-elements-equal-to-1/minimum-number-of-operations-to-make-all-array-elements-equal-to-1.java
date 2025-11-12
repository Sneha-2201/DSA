class Solution {
    public int minOperations(int[] nums) {
        
        int n = nums.length;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 1) countOnes++;
        }

        // Case 1: Already have 1s
        if (countOnes > 0) return n - countOnes;

        // Case 2: Need to create a 1
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // no need to extend further
                }
            }
        }

        // If no subarray can create a 1
        if (minLen == Integer.MAX_VALUE) return -1;

        // (minLen - 1) to create one 1 + (n - 1) to make all 1s
        return (minLen - 1) + (n - 1);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;

    }
}