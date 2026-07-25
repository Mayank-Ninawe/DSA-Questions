class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1; // last element replaced with -1

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];     // store current value
            arr[i] = maxRight;     // replace with max to right
            if (temp > maxRight) { // update maxRight
                maxRight = temp;
            }
        }
        return arr;
    }
}
