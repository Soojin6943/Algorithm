import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // 키 : 유저 아이디 / 값 : 닉네임
        
        
        // 엔터 -> 닉네임 들어왔다 출력
        // 리브 -> 닉네임 나갔다 출력
        
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        
        // 유저 닉네임 설정
        for (String s: record){
            String[] user = s.split(" ");
            if (!user[0].equals("Leave")){
                map.put(user[1], user[2]);
            }
        }
        
        // 최종 닉네임으로 설정
        for (String s: record){
            String[] user = s.split(" ");
            
            if (user[0].equals("Enter")){
                String result = map.get(user[1]) + "님이 들어왔습니다.";
                answer.add(result);
            } else if (user[0].equals("Leave")) {
                String result = map.get(user[1]) + "님이 나갔습니다.";
                answer.add(result);
            } else {
                continue;
            }
        }
        
        return answer.toArray(new String[(answer.size())]);
    }
}