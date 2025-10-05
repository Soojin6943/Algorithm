import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] time_result = new int[10000];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        List<List<Integer>> times = new ArrayList<>();
        for (int i=0; i<records.length; i++){
            String[] str = records[i].split(" ");
            int hour = Integer.parseInt(str[0].split(":")[0]);
            int min = Integer.parseInt(str[0].split(":")[1]);
            
            // 시간 계산
            int time = hour * 60 + min;
            int due = 0;
            // 시간 넣기
            if (str[2].equals("IN")){
                map.put(Integer.parseInt(str[1]), time);
            } else if (str[2].equals("OUT")){
                time_result[Integer.parseInt(str[1])] += time - map.get(Integer.parseInt(str[1]));
                map.remove(Integer.parseInt(str[1]));                              
            }
        }
        
        for (int i : map.keySet()){
            int last_time = 23 * 60 + 59;
            time_result[i] += (last_time - map.get(i));
        }
        
        // 가격 계산
        for (int i=0; i<time_result.length; i++){
            if (time_result[i] == 0){
                continue;
            } 
            if (time_result[i] <= fees[0]){
                answer.add(fees[1]);
            } else {
                int t = time_result[i] - fees[0];
                int sum = fees[1];
                sum += (t % fees[2] == 0 ? (t / fees[2]) * fees[3] : (t / fees[2] + 1) * fees[3]);
                answer.add(sum);
            }
        }
                           
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}