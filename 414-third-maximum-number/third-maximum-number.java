class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {

            // skip duplicates
            if (n == first || n == second || n == third) continue;

            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        // if third not found, return maximum
        return third == Long.MIN_VALUE ? (int) first : (int) third;
        
    }
}