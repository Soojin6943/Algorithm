import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // 의상의 종류 별 개수를 담을 해시
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<clothes.length; i++){
            // 키 : 의상의 종류, 값 : 의상종류 값 + 1 (기본 0)
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        // 계산
        for (String key : map.keySet()){
            answer *= (map.get(key) + 1);
        }
        // 하나도 선택 안하는 경우 빼주기
        answer -= 1;
        
        return answer;
    }
}