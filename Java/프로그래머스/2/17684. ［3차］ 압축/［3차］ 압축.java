import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> word = new HashMap<>(){};
        word.put("A", 1); word.put("B", 2); word.put("C", 3); word.put("D", 4); word.put("E", 5);
        word.put("F", 6); word.put("G", 7); word.put("H", 8); word.put("I", 9); word.put("J", 10);
        word.put("K", 11); word.put("L", 12); word.put("M", 13); word.put("N", 14); word.put("O", 15);
        word.put("P", 16); word.put("Q", 17); word.put("R", 18); word.put("S", 19); word.put("T", 20);
        word.put("U", 21); word.put("V", 22); word.put("W", 23); word.put("X", 24); word.put("Y", 25); 
        word.put("Z", 26);
        
        ArrayList<Integer> arr = new ArrayList<>();

        int number = 27;
        for(int i=0; i<msg.length(); ){
            String str = String.valueOf(msg.charAt(i));
            //System.out.println("탐색 시작 문자" + str);
            int end = i+1;
            // 단어 확인
            while(end <= msg.length()){
                // 단어가 사전에 있음
                if (word.containsKey(msg.substring(i, end))){
                    str = msg.substring(i, end);
                    end++;
                    continue;
                } else {
                    // 사전에 없음
                    break;
                }
            }
            
            arr.add(word.get(str));
            //System.out.println("색인 : " + word.get(str));
            if(end <= msg.length()){
                word.put(msg.substring(i, end), number++);
                //System.out.println("사전 추가 : " + word.get(msg.substring(i, end)));
            }
            
            i = end - 1;
        }
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}