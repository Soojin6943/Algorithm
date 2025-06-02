import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 키 : 이름 , 값 : 이름 갯수
        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String p : participant){
            // 값이 0이면이거나 없으면(0) p 반환
            if (map.getOrDefault(p, 0) == 0) {
                return p;
            } else {
                // 있으면 이름 갯수 -1
                map.put(p, map.get(p) - 1);
            }
        }
        return null;
    }
}