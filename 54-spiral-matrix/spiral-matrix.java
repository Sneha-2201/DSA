class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int sr = 0;
        int er = m-1;
        int sc = 0;
        int ec = n-1;
        //logic
        // 1.row wise left to right --> print strarting row , from sc to ec
        // 2.col wise top to bttom --> ending col print karani hai , from sr to er
        //3.row wise right to left --> ending row print ,ec to sc
        // 4.col wise bottom to top --> starting col print karana hai , er to sr

        // 3 and 4 mei dobara check lagagye ge jisse agar ek row hi ho ya ek col hi ho toh baaki ke loop na chale jinka koi use nhi out of bound error milega usse 



       // counter bhi accordingly manage 



        while(sr<=er && sc<=ec){
            for(int col = sc ; col<= ec ; col++){
                result.add(matrix[sr][col]);
            }
            sr++;

            for(int row = sr; row<= er; row++){
                result.add(matrix[row][ec]);
            }
            ec--;
            if(sr<=er){
            for(int col = ec ; col>= sc ; col--){
                result.add(matrix[er][col]);
            
            }
            er--;
            }

            if(sc<=ec){
            for(int row= er; row>= sr ; row--){
                result.add(matrix[row][sc]);
            }
            sc++;
            }
        }

        return result;
    }
}