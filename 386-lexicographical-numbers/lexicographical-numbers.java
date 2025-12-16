class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }
        return result;
    }

    void dfs(int curr, int n) {
        if (curr > n) return;

        result.add(curr);

        for (int i = 0; i <= 9; i++) {
            dfs(curr * 10 + i, n);
        }

        
    }
}