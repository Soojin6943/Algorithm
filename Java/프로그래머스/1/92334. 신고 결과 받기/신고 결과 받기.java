import java.util.HashSet;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 중복 신고 제거
        HashSet<String> set = new HashSet<>();
        for (String s : report){
            set.add(s);
        }
        
        // 신고 당한 횟수를 저장하는 해시맵
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : set){
            String[] str = s.split(" ");
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        
        // 정지 유저 저장 set
        HashSet<String> stop = new HashSet<>();
        for (String s : map.keySet()){
            if (map.get(s) >= k){
                stop.add(s);
            }
        }
        
        // 메일 받는 횟수
        HashMap<String, Integer> mail = new HashMap<>();
        for (String s : set){
            String[] str = s.split(" ");
            if (stop.contains(str[1])){ // 정지된 유저라면
                mail.put(str[0], mail.getOrDefault(str[0], 0) + 1);
            }
        }
        
        for (int i=0; i<id_list.length; i++) {
            answer[i] = mail.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}