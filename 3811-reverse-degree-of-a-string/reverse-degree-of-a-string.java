class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i =0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            int reversepos = 26- (ch - 'a');
            int pro = (i+1) * reversepos;
            sum += pro;
        }
        return sum ;
    }
}