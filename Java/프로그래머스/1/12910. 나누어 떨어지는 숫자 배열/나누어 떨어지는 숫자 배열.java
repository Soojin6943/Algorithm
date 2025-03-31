import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int a : arr){
            if (a % divisor == 0) {
                answer.add(a);
            }
        }
        
        if (answer.size() == 0){
            answer.add(-1);
        }
        
        
        int[] an = answer.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(an);
        
        return an;
    }
}