import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = minVal; i <= maxVal; i++) {
            if (!numSet.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }
}