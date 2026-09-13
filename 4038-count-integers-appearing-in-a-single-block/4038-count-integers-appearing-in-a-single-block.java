import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> special = new HashSet<>();
        
        int i = 0;
        while (i < nums.length) {
            int val = nums[i];
            if (seen.contains(val)) {
                // already seen in multiple blocks → not special
                special.remove(val);
                while (i < nums.length && nums[i] == val) i++;
                continue;
            }
            
            // mark as seen and special initially
            seen.add(val);
            special.add(val);
            
            // skip the contiguous block
            while (i < nums.length && nums[i] == val) i++;
        }
        
        return special.size();
    }
}
