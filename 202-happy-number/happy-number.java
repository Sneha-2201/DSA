class Solution {
        private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

        public boolean isHappy(int n) {
            int slow = n;
        int fast = getSquareSum(n);

        // move slow by 1 step, fast by 2 steps
        while (fast != 1 && slow != fast) {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
        }

        return fast == 1;

        
    }
}