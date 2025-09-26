class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        return  gcd(sumOdd,sumEven);
        
        }

    private  static int gcd(int a,int b){
            if(a==0)return b;
            return gcd(b%a,a);


     }
}