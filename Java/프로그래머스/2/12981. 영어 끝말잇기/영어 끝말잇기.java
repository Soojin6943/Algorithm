import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 해시셋으로 단어 넣기
        // 이미 있으면 걔 반환
        // 성공이면 0,0 반환
        // 마지막 단어랑 다르면 실패
        
        // 기본값 0이므로 특별한 변화 없으면 0,0 반환
        int[] answer = new int[2];

        HashSet<String> set = new HashSet<>();
        
        set.add(words[0]);
        char last = words[0].charAt(words[0].length() -1);
        
        for (int i=1; i<words.length; i++){
            char first = words[i].charAt(0);
            if ((set.contains(words[i]) && !set.isEmpty()) || last != first){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                set.add(words[i]);
                last = words[i].charAt(words[i].length() -1);
            }
        }
        
        return answer;
    }
}