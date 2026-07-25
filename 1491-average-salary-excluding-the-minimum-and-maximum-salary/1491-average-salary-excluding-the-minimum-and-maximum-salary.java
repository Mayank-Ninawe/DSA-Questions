import java.util.*;
class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;

        for(int s:salary){
            min=Math.min(min,s);
            max=Math.max(s,max);
            sum+=s;
        }
       
        return (sum-min-max)/(salary.length-2);
    //    Arrays.sort(salary);

    //    double sum=0;

    //    for(int i=1;i<salary.length-1;i++){
    //         sum+=salary[i];
    //    }

    //    return sum=sum/(salary.length-2);
    }
}