class Solution {
    public boolean isMonotonic(int[] nums) {
      boolean isIncreasing = true;
      boolean isDecreasing = true ;
      for(int i =1; i< nums.length;i++){
        if(nums[i-1]>nums[i]){
            isDecreasing = false;
        }
        if(nums[i-1]< nums[i]){
            isIncreasing = false;
        }
      } 
      if(isIncreasing || isDecreasing ){
        return true;
      }
      return false;
    }
}