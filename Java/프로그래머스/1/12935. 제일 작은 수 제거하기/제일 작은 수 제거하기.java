import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        int minIdx = 0;
        
        for (int i=0; i<arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIdx = i;
            }
        }
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        
        for (int i=0; i<arr.length; i++) {
            if (i != minIdx) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}