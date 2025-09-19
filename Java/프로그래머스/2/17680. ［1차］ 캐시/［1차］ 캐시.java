import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String> list = new LinkedList<>();
        
        for (String s : cities){
            s = s.toLowerCase();
            if (list.remove(s)){
                // 삭제 성공하면 true
                list.add(s);
                answer += 1;
            } else {
                if (list.size() < cacheSize){
                    list.add(s);
                } else {
                    list.add(s);
                    list.removeFirst();
                }
                
                answer += 5;
            }
        }
        
        
        return answer;
    }
}