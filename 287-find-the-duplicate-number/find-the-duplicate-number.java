class Solution {
    public int findDuplicate(int[] nums) {
        int slow =nums[0];
        int fast =nums[0];
        do{
            slow = nums[slow];  //moving slow 1 step
            fast =nums[nums[fast]]; //moving fast 2 times
        }while(slow!=fast); //detect cycle
        
        
        //cycle exist .now find starting point of cycle
        fast = nums[0];
        while(slow!=fast){
            slow= nums[slow]; // 1 step
            fast = nums[fast];  // here also 1 step
        }
        return slow;
    
       
        
    }
}