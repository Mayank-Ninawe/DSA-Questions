import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // sort array

        int n = nums.length;

        // Case 1: product of last 3 (largest)
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];

        // Case 2: product of first 2 (smallest, possibly negative) × largest
        int option2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(option1, option2);
    }
}
