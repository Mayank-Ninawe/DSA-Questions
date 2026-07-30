class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        return Math.min(n, 8) * 1
             + Math.min(Math.max(n - 8, 0), 8) * 2
             + Math.min(Math.max(n - 16, 0), 8) * 3
             + Math.min(Math.max(n - 24, 0), 2) * 4;
    }
}
