import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // 크기 카운트 배열 (0부터라 +1)
        HashMap<Integer, Integer> cnt = new HashMap<>();
        
        for (int tan : tangerine){
            cnt.put(tan, cnt.getOrDefault(tan, 0) + 1);
        }
        
        List<Integer> cnt1 = new ArrayList<>(cnt.values());
        
        cnt1.sort(Collections.reverseOrder());
        
        for(int c : cnt1){
            k -= c;
            answer ++;
            if (k<=0) break;
        }
        // System.out.println(cnt[cnt.length-1]);
        return answer;
    }
}