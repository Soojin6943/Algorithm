import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        // 카드들 큐에 넣기
        // 골 반복문 - 카드 뭉치 프론트랑 같으면 풀하고 다음 비교/ 아니면 노 반환
        
        Queue<String> que1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> que2 = new ArrayDeque<>(Arrays.asList(cards2));
        
        for (String s : goal){
            if (s.equals(que1.peek())){
                que1.poll();
            } else if (s.equals(que2.peek())){
                que2.poll();
            } else {
                return "No";
            }
        }

        
        return "Yes";
    }
}