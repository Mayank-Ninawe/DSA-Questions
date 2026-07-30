import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] in : intervals) {
            if (in[0] >= lastEnd) {
                count++;
                lastEnd = in[1];
            }
        }
        return intervals.length - count;
    }
}
