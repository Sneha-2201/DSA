class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
    Set<Integer> seen = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                res[idx++] = num;   // store the duplicate
            } else {
                seen.add(num);
            }
        }

        return res;

    }
}