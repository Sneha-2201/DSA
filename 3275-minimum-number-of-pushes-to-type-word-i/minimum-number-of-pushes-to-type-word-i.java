class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        int n= word.length();
        if(n<8){
            return n;
        
        }else{
            for(int i =0 ; i<n ; i++){
                if(i<8){
                   count++; 
                }else if(i>=8 && i<16){
                    count+=2;
                }else if(i>=16 && i<24){
                    count+=3;
                }else{
                    count+=4;
                }
            }
        }
            
       return count ; 
        
    }
}