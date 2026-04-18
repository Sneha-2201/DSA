class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));

        
    }
    private int reverse(int x){
        int res =0;
        while (x>0){
            res = res*10 +(x %10);
            x/=10;
        }
        return res;
    }
}