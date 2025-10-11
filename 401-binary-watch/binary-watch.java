class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        
        List<String> result = new ArrayList<>();

        // loop through all possible hour and minute combinations
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                // count bits in hour and minute
                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);

                // if total LEDs on == turnedOn, it’s a valid time
                if (totalBits == turnedOn) {
                    // format minutes with leading zero if needed
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }
        return result;

    }
}