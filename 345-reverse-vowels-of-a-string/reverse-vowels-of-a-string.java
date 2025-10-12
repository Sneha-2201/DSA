class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int left =0 , right = arr.length-1;

        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }else if (!isVowel(arr[right])){
                right--;
            }else {
                char temp = arr[left];
                arr[left]= arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
        
    }
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

    }
}