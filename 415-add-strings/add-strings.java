class Solution {
    public String addStrings(String num1, String num2) {
        
        int i = num1.length() - 1;  // pointer for num1
        int j = num2.length() - 1;  // pointer for num2
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? num1.charAt(i) - '0' : 0; // convert char to int
            int y = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);  // store last digit
            carry = sum / 10;     // update carry

            i--;
            j--;
        }

        return sb.reverse().toString(); // reverse to get correct order

    }
}