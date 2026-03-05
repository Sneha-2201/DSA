class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        int start1 = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            // pattern starting with 0 -> 0101
            if(i % 2 == 0){
                if(c != '0') start0++;
            } else{
                if(c != '1') start0++;
            }

            // pattern starting with 1 -> 1010
            if(i % 2 == 0){
                if(c != '1') start1++;
            } else{
                if(c != '0') start1++;
            }
        }

        return Math.min(start0, start1);
        
        
    }
}