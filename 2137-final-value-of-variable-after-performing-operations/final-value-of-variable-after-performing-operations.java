class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;  // starting value

        // Loop through all operations
        for (String op : operations) {
            if (op.contains("++")) {
                x++; // increment if "++" found
            } else {
                x--; // decrement otherwise
            }
        }

        return x;

        
    }
}