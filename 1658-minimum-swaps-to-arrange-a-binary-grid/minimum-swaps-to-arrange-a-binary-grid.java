class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeros = new int[n];
        
        // Step 1: Count trailing zeros
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) count++;
                else break;
            }
            zeros[i] = count;
        }
        
        int swaps = 0;
        
        // Step 2: Arrange rows greedily
        for (int i = 0; i < n; i++) {
            int required = n - i - 1;
            int j = i;
            
            while (j < n && zeros[j] < required) {
                j++;
            }
            
            if (j == n) return -1;
            
            // Bring row j to i
            while (j > i) {
                int temp = zeros[j];
                zeros[j] = zeros[j - 1];
                zeros[j - 1] = temp;
                j--;
                swaps++;
            }
        }
        
        return swaps;

        
    }
}