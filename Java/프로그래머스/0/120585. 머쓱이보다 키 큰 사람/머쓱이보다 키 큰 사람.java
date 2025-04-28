import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = array.length;
        
        // 필요한 만큼만 반복하도록 오름차순 정렬
        Arrays.sort(array);
        
        // 작은 키까지만 반복 카운트
        for (int h : array){
            if (h > height){
                break;
            }
            answer -= 1;
        }
        return answer;
    }
}