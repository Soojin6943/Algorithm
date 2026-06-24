import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        String answer = "";
        
        for (String name : participant) {
            if (!map.containsKey(name)) {
                answer = name;
                break;
            }
            if (map.containsKey(name)) {
                if (map.get(name) < 1) {
                    answer = name;
                    break;
                }
                map.put(name, map.getOrDefault(name, 0) - 1);
            }
        }
        return answer;
    }
}