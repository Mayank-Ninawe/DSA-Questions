class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int num:nums) sum+=num;
        if(Math.abs(target)>sum) return 0;
        if((sum+target)%2!=0){
            return 0;
        } 
        int subset=(sum+target)/2;
        if(subset<0) return 0;
        int[][] dp=new int[n+1][subset+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int s=0;s<=subset;s++){
                dp[i][s]=dp[i-1][s];
                if(nums[i-1]<=s){
                    dp[i][s]+=dp[i-1][s-nums[i-1]];
                }
            }
        }
        return dp[n][subset];
    }
}