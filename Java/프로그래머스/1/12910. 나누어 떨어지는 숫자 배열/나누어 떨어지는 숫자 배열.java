import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        
        if (list.size() < 1) {
            return new int[]{-1};
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}