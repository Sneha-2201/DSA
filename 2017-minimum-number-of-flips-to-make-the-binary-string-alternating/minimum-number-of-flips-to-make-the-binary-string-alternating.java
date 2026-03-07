class Solution {
    public int minFlips(String s) {
         int n = s.length();
        s = s + s;

        int alt1 = 0;
        int alt2 = 0;
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++){

            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != expected1) alt1++;
            if(s.charAt(i) != expected2) alt2++;

            if(i >= n){
                char prev = s.charAt(i-n);

                char exp1 = ((i-n) % 2 == 0) ? '0' : '1';
                char exp2 = ((i-n) % 2 == 0) ? '1' : '0';

                if(prev != exp1) alt1--;
                if(prev != exp2) alt2--;
            }

            if(i >= n-1){
                res = Math.min(res, Math.min(alt1, alt2));
            }
        }

        return res;
        
    }
}