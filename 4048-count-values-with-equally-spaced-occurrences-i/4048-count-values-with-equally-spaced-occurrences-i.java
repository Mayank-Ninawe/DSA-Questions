import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Step 1: Collect indices of each number
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int count = 0;
        // Step 2: Check special condition
        for (int key : map.keySet()) {
            List<Integer> idx = map.get(key);
            if (idx.size() == 3) {  // must appear exactly 3 times
                int i1 = idx.get(0), i2 = idx.get(1), i3 = idx.get(2);
                if (i2 - i1 == i3 - i2) { // equally spaced check
                    count++;
                }
            }
        }
        
        // Step 3: Return distinct special count
        return count;
    }
}
