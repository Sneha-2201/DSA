class Solution {
    public double myPow(double x, int n) {
        long N =n;
        if(N<0){
            x = 1/x;
            N = -N;

        }
        return helper(x,N);
    }
    private double helper(double x ,long n){
        if(n==0)return 1;
        double call = helper(x,n/2);
        if(n%2==0)return call*call;
        else return x*call*call;
        
    }
}