import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add((int)(n % 10));
            n = n / 10;
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}