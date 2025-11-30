class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int [nums.length];
        int [] rightSum = new int [nums.length];
        leftSum[0] = nums[0];
        for(int i =1 ; i< nums.length ; i++){
            leftSum[i]=leftSum[i-1]+nums[i];

        }
        rightSum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2 ; i>= 0 ; i--){
            rightSum[i]=rightSum[i+1]+nums[i];

        }
        int n = nums.length;
        int[]answer = new int[n];
         for(int i = 0; i < n; i++) {
            int left = (i == 0 ? 0 : leftSum[i - 1]);
            int right = (i == n - 1 ? 0 : rightSum[i + 1]);

            answer[i] = Math.abs(left - right);
        }


        
        return answer;
    }
}