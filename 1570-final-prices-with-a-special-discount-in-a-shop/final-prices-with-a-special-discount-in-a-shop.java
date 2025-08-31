class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();           // Copy original prices to store final results
        Deque<Integer> stack = new ArrayDeque<>();  // Stack stores indices pending discounts

        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                ans[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }

        return ans;

        
    }
}