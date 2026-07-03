class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb =new StringBuilder(s);
           
        

            int left = 0;
            int right = k-1;
            while(left< right){
               char temp = s.charAt(left);
               sb.setCharAt(left ,s.charAt(right));
               sb.setCharAt(right , temp);
               left ++;
               right --;
            }
        
       return sb.toString(); 
    }
}