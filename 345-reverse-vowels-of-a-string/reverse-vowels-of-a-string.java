class Solution {
    public String reverseVowels(String s) {
      StringBuilder sb = new StringBuilder(s);
      Set <Character> vowels =  Set.of('a','e','o','i','u','A','E','I','O','U');
      int left = 0;
      int right = s.length()-1;
      while(left<right){
        if((vowels.contains(s.charAt(left))) && (vowels.contains(s.charAt(right)))){
            char temp = s.charAt(left);
            sb.setCharAt(left , s.charAt(right));
            sb.setCharAt(right , temp);
            left++;
            right--;
        }
        else if ((!vowels.contains(s.charAt(left))) && (!vowels.contains(s.charAt(right)))){
            left++;
            right--;
        }
        else if ((!vowels.contains(s.charAt(left))) && (vowels.contains(s.charAt(right)))){
            left++;
        }
        else if ((vowels.contains(s.charAt(left))) && (!vowels.contains(s.charAt(right)))){
            right--;
        }
      }
      return sb.toString();
    }
}