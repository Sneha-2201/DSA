class Solution {
    public int numberOfSpecialChars(String word) {
       
        HashSet<Character> set = new HashSet<>();
        for(int i=0 ; i<word.length(); i++){
            set.add(word.charAt(i));
        }
        int count =0;
        for(char ch : set){
            if(Character.isLowerCase(ch)){
                char upper = Character.toUpperCase(ch);
                if(set.contains(upper)){
                count++;
            }
            }
            
        }

        return count ;

        
    }
}