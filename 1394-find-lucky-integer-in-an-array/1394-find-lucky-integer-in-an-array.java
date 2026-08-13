import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int a : arr){
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        
        int ans = -1;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                ans = Math.max(ans, entry.getKey());
            }
        }
        
        return ans;
    }
}
