class Solution {
    public int reverse(int x) {
        int rev =0;
        boolean isNegative = x<0;
        x = Math.abs(x);
        while (x>0){
            int d = x%10;
            x=x/10;
            if(rev > Integer.MAX_VALUE /10 ){
                return 0;
            }
            rev=rev*10+d;

        }
        if(isNegative){
            return -rev;
        }else{
            return rev;}


    }
}