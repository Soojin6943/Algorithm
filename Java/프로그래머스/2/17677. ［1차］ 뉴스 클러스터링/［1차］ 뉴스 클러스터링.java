import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 소문자로 만들기
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashSet<String> set = new HashSet<>();
        
        // str1 2글자 자르고 수 세기
        HashMap<String, Integer> str1_map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str1.length()-1; i++){
            
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z'){
                sb.append(str1.charAt(i));
                int next = i + 1;
                char next_str = str1.charAt(next);
                if (next_str>='a' && next_str<='z'){
                    sb.append(next_str);
                    str1_map.put(sb.toString(), str1_map.getOrDefault(sb.toString(), 0)+1);
                    set.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.setLength(0);
                }
            }
        }
        
        // str2 2글자 자르고 수 세기
        HashMap<String, Integer> str2_map = new HashMap<>();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<str2.length()-1; i++){
            
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'){
                sb2.append(str2.charAt(i));
                int next = i + 1;
                char next_str = str2.charAt(next);
                if (next_str>='a' && next_str<='z'){
                    sb2.append(next_str);
                    str2_map.put(sb2.toString(), str2_map.getOrDefault(sb2.toString(), 0)+1);
                    set.add(sb2.toString());
                    sb2.setLength(0);
                } else {
                    sb2.setLength(0);
                }
            }
        }
        // test
        // for (String str : str1_map.keySet()){
        //     System.out.println(str + " " + str1_map.get(str));
        // }
        //System.out.println(str1_map.get("fr"));
        
        // 합집합 계산
        int hap = 0;
        // 곱집합 계산
        int g = 0;
        for (String s : set){
            hap += Math.max(str1_map.getOrDefault(s, 0), str2_map.getOrDefault(s, 0));
            if (str1_map.containsKey(s) && str2_map.containsKey(s)){
                g += Math.min(str1_map.get(s), str2_map.get(s));
            }
        }
        

        System.out.println(g + " " + hap);
        // System.out.println(jkd);
        answer =  (int)((double)g / hap * 65536); 
        if (hap == 0 && g == 0){
            return 65536;
        }
        return answer;
    }
}
