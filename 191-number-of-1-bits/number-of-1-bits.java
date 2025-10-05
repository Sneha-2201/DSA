class Solution {
    public int hammingWeight(int n) {
        
                int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {  // check last bit
                count++;
            }
            n >>>= 1;  // unsigned right shift
        }
        return count;

    }
}