class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        
        int maxLength = 0;
        HashMap<Character , Integer> lastseen = new HashMap<>();
        for (int right =0; right < s.length() ; right++){
            char ch = s.charAt(right);
             
            if ( lastseen.containsKey(ch) && lastseen.get(ch)>= left ){
                left = lastseen.get(ch)+1 ;
            }
            lastseen.put(ch , right);
            maxLength = Math.max(maxLength , right-left +1);

            }

            return maxLength;
        }
        
    }
