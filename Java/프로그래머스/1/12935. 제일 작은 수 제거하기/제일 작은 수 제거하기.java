import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        } else {
            ArrayList<Integer> answer = new ArrayList<>();
            
            for (int i=0; i<arr.length; i++){
                if (arr[i] != min) {
                    answer.add(arr[i]);
                }
            }
            
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}