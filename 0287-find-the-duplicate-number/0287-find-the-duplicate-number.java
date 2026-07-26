class Solution {
    public int findDuplicate(int[] nums) {
       int low = 1;
        int high = nums.length - 1; // because nums has n+1 elements

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Count how many numbers are ≤ mid
            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                // Duplicate is in the lower half
                high = mid;
            } else {
                // Duplicate is in the upper half
                low = mid + 1;
            }
        }

        return low;

    }
}