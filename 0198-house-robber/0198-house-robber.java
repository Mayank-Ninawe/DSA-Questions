class Solution {
    public int rob(int[] nums) {
        // int even=0;
        // int odd=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0) odd+=nums[i];
        //     else even+=nums[i];
        // }
        // return Math.max(even,odd);

        int prev1=0;
        int prev2=0;
        for(int num:nums){
            int temp=Math.max(prev1,prev2+num);
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}