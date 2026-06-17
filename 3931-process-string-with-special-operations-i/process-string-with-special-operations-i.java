class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int i =0; i< s.length() ; i++){
            if(Character.isLowerCase(s.charAt(i))){
                result.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*' && result.length()>0){
                result.deleteCharAt(result.length()-1);
            }
            else if(s.charAt(i)=='#'){
                result.append(result.toString());
            }
            else if(s.charAt(i)=='%'){
                result.reverse();
            }
            
        }
        return result.toString();
    }
}