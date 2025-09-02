class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans= new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n;i++){
            //remove smaller element from back
            while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            //ad current index
            dq.addLast(i);
            
            // remove if its is out of window
            if(dq.peekFirst() <=i-k){
                dq.pollFirst();
            }

            //store max in answer (only when window size>=k)
            if(i>=k-1){
                ans[i-k+1]= nums[dq.peekFirst()];
            }
        }

        return ans;

        
    }
}