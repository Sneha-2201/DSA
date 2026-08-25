class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       for(int x : nums){
        set.add(x);
       }
       for( int i =1; i<=110; i++){
        int a = k * i;
        if(!set.contains(a))return a;

         
       }
       return 1;
       
    }
}