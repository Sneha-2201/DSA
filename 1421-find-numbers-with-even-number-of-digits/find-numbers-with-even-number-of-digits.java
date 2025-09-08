class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            // count digits
            while (temp > 0) {
                temp /= 10;  // divide by 10 each time
                digits++;
            }

            if (digits % 2 == 0) {
                count++;  // even digit number mila
            }
        }

        return count;

    }
}