class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] arr1= new int[n];
        
        int start =0;
        int end = n -1;
        for(int i = 0; i< nums.length ; i++){
           if(nums[i]>=0){
            arr[start++] = nums[i];

           }else{
            arr[end--]=nums[i];
           }
        }
        start = 0;
        end = n-1;
        for(int i =0 ; i<n ; i++){
            if(i % 2 == 0){
                arr1[i] = arr[start++];
            }else{
                arr1[i] = arr[end--];
            }
        }
        return arr1;
    }
}