import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer;
        
        
        // 숫자 , 나온 횟수
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] str = s.split(",");
        for (String st : str){
            StringBuilder sb = new StringBuilder();
            for (char c : st.toCharArray()){
                if (c == '{' || c == '}' || c == ','){
                    continue;
                } else {
                    sb.append(c);
                }
            }
            int num = Integer.parseInt(sb.toString());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        System.out.println(map);
        
        // 횟수가 많은 것부터 넣기
        List<Integer> keySet = new ArrayList<>(map.keySet());
        // 횟수 내림차순 정렬
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
    
        System.out.println(keySet);
        
//         answer = new int[map.size()];
        
//         for(int num : keySet){
//             int i = 0;
//             answer[i] = num;
//             i++;
//         }
        return keySet.stream().mapToInt(Integer::intValue).toArray();
    }
}