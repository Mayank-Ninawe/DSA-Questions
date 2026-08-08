class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==0) return false;
        int mid=nums[nums.length/2];
        for(int num:nums){
            if(num==mid){
                count++;
            }
        }
        return count==1;
    }
}