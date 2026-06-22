class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] freq = new int [26];
        for(int i =0 ; i< text.length() ; i++){
            char ch = text.charAt(i);
            freq[ch - 'a']++ ;
        }  
        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'];
        int o = freq['o' - 'a'];
        int n = freq['n' - 'a'];

        l/=2;
        o/=2;

        return Math.min(Math.min(Math.min(Math.min(b,a),l),o),n);
    }    
}