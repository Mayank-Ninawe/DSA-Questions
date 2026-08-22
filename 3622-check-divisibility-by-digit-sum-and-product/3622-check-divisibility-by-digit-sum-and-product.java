class Solution {
    public boolean checkDivisibility(int n) {
        if(n==0) return true;
        int sum=0;
        int product=1;
        int current=n;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        return current%(sum+product)==0;
    }
}