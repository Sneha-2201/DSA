class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;

            if ((leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }

        return count;

        
    }
}