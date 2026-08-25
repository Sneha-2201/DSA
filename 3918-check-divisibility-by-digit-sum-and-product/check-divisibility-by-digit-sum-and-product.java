class Solution {
    public boolean checkDivisibility(int n) {
        int orig = n;
        int digit_sum =0 ;
        int product = 1;
        while(n>0){
            int d = n%10;
            digit_sum += d;
            product  *= d;
            n = n/10;

        }
         int q= product + digit_sum;
         return (orig % q==0);
        
    }
}