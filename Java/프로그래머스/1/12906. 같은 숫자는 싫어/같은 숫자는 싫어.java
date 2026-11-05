import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> que = new ArrayDeque<>();
        
        for (int a : arr) {
            if (que.isEmpty()) {
                que.addLast(a);
                // System.out.println("비어있는 값" + a);
                continue;
            }
            if (que.peekLast() == a) {
                // System.out.println("중복된 값" + a);
                continue;
            }
            // System.out.println("연속되지 않은 값" + a);
            que.addLast(a);
        }
        
        
        int[] result = new int[que.size()];
        
        for (int i=0; i<result.length; i++) {
            result[i] = que.pollFirst();
        }
        
        return result;
    }
}