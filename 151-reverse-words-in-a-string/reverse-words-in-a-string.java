class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        
        int end = s.length()-1;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(i < end){
                   String word = s.substring(i+1 , end+1);
               
                   sb.append(word);
                   sb.append(" ");
                }
                end = i-1;
                while(end >=0 && s.charAt(end) == ' '){
                    end--;
                }
            }
        }
        
        sb.append(s.substring(0, end +1));
        return sb.toString();
    }
}