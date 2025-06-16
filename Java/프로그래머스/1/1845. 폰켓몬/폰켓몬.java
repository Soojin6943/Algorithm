import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // hash set에 키만 넣기
        // 비교 후 정답 반환
        
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : nums){
            set.add(n);
        }

        if (nums.length/2 >= set.size()){
            answer = set.size();
        } else {
            answer = nums.length/2;
        }
        
    
        return answer;
    }
}