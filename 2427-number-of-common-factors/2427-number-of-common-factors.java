class Solution {
    public int commonFactors(int a, int b) {
        int gcd = findGCD(a, b);
        int count = 0;
        
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    private int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
