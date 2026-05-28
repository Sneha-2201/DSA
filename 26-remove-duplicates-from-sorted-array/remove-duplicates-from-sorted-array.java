class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int p1 = 0;
        int p2 = 1;
        while(p2<nums.length){
            if(nums[p1] == nums[p2]){
                p2++;
            }
            else{
                nums[p1+1] = nums[p2];
                p1++;
                p2++;

            }
        }
        
        return p1+1;

        

        
    }
}