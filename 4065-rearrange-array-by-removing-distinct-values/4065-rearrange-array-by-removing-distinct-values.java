import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        while (!freq.isEmpty()) {
            List<Integer> distinct = new ArrayList<>(freq.keySet());
            Collections.sort(distinct);

            for (int val : distinct) {
                ans.add(val);
                freq.put(val, freq.get(val) - 1);
                if (freq.get(val) == 0) {
                    freq.remove(val);
                }
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) res[i] = ans.get(i);
        return res;
    }
}
