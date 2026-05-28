import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add((int)(n % 10));
            n = n / 10;
        }
        
        list.sort((o1, o2) -> o2.compareTo(o1));
        
        for (int i=0; i<list.size(); i++) {
            answer *= 10;
            answer += list.get(i);
        }
        return answer;
    }
}