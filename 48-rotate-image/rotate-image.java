class Solution {
    public void rotate(int[][] matrix) {
                int n = matrix.length;

        // Transpose upper triangular ya lower triangular mein bas swap if inplace ho
        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse logic har row mei columns pe two pinter jaise socho
        for(int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while(left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        
    }
}