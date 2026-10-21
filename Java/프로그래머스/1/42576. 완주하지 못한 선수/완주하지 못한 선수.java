import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 이름, 몇명인지
        Map<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            // 기본 0, 아니면 +1
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        
        Set<String> key = map.keySet();
        for (String k : key) {
            if (map.get(k) != 0) {
                return k;
            }
        }
        return "";
    }
}