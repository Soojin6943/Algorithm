import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 몸무게 정렬
        Arrays.sort(people);
        
        // 두명이 탈 수 있는 보트 계산
        int now = 0;
        for (int i=people.length-1; i>now; i--){
            if(people[now] + people[i] > limit){
                continue;
            } else {
                answer ++;
                now ++;
            }
        }
        // 남은 사람들 태울 보트 더하기
        answer += people.length-answer*2;
        return answer;
    }
}