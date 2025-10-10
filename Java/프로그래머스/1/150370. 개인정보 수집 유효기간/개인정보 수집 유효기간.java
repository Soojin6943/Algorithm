import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        // 파괴할 애들
        ArrayList<Integer> delete = new ArrayList<>();
        String[] today_arr = today.split("\\.");
        int today_year = Integer.parseInt(today_arr[0]);
        int today_month = Integer.parseInt(today_arr[1]);
        int today_day = Integer.parseInt(today_arr[2]);
        
        // 약관들
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<terms.length; i++){
            String[] s = terms[i].split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }
        
        for (int i=0; i<privacies.length; i++){
            String[] str = privacies[i].split(" ");
            String[] day_arr = str[0].split("\\.");
            
            String term = str[1];
            int plus_month = map.get(term);
            int now_month = Integer.parseInt(day_arr[1]);
            int now_year = Integer.parseInt(day_arr[0]);
            int now_day = Integer.parseInt(day_arr[2]);
            
            if (now_month + plus_month > 12){
                int plus_year = (now_month + plus_month) % 12 == 0 ? (now_month + plus_month) / 12 -1 : (now_month + plus_month) / 12;
                now_year = now_year + plus_year;
                now_month = (now_month + plus_month) % 12 == 0 ? 12 :  (now_month + plus_month) % 12;
            } else {
                now_month += plus_month;
            }
            
            if (now_year < today_year) {
                delete.add(i+1);
                continue;
            } else if (now_year == today_year && now_month < today_month){
                delete.add(i+1);
                continue;
            } else if (now_year == today_year && now_month == today_month && now_day <= today_day){
                delete.add(i+1);
                continue;
            }
        }
        
        // 오름차순 반환
        
        return delete.stream().mapToInt(Integer::intValue).toArray();
    }
}