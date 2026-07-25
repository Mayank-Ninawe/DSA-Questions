class Solution {

    public static void arrayRotate(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;

        arrayRotate(nums,0,nums.length-1);
        arrayRotate(nums,0,k-1);
        arrayRotate(nums,k,nums.length-1);

    }
}