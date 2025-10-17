class Solution {
    public int reverseBits(int n) {
        
        int result = 0; // step 1

        for (int i = 0; i < 32; i++) { // loop 32 times
            result <<= 1;        // shift result left to make space
            result |= (n & 1);   // take last bit of n and add it
            n >>>= 1;            // shift n right (unsigned)
        }

        return result;
    }
}