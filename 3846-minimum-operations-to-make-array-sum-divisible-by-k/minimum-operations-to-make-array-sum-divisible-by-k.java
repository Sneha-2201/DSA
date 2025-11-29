class Solution {
    public int minOperations(int[] nums, int k) {
        int i=0;
        int sum =0;
        while(i<nums.length){
            sum+=nums[i];
            i++;
        }
        int res = sum%k;
        return res;
        
    }
}