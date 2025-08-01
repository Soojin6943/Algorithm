import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 박스 갯수 
        int boxNum = score.length / m;  // 1
        
        // 점수 정렬
        Arrays.sort(score); // 1, 1, 1, 2, 2, 3, 3
        
        // 점수 계산
        for (int i=score.length; i>=m; i-=m){
            answer += score[i-m] * m;
        }
        
        return answer;
    }
}