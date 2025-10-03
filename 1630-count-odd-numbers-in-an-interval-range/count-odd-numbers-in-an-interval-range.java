class Solution {
    public int countOdds(int low, int high) {
        int total = (high - low + 1);
        return total / 2 + (low % 2 == 1 && high % 2 == 1 ? 1 : 0);

    }
}