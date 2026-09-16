class Solution {
    // Helper function to check if a number is prime
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        // Count frequencies
        int[] freq = new int[101]; // since 0 <= nums[i] <= 100
        for (int num : nums) {
            freq[num]++;
        }

        // Check if any frequency is prime
        for (int count : freq) {
            if (isPrime(count)) return true;
        }
        return false;
    }
}
