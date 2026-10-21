import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int target = nums.length / 2;
        
        Set<Integer> types = new HashSet<>();
        
        for (int n : nums) {
            types.add(n);
        }
        
        
        return Math.min(target, types.size());
    }
}