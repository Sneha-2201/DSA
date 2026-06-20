class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();

        long n = num;

        // Handle negative numbers
        if (n < 0) {
            n += (1L << 32);
        }

        while (n > 0) {

            int rem = (int)(n % 16);

            sb.append(hex.charAt(rem));

            n /= 16;
        }

        return sb.reverse().toString();
        
    }
}