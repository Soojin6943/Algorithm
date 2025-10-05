import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        
        
        for (int i=0; i<survey.length; i++){
            int n = choices[i];
            char bad = survey[i].charAt(0);
            char good = survey[i].charAt(1);
            
            switch (n) {
                case 1 :
                    map.put(bad, map.getOrDefault(bad, 0) + 3);
                    break;
                case 2 :
                    map.put(bad, map.getOrDefault(bad, 0) + 2);
                    break;
                case 3 :
                    map.put(bad, map.getOrDefault(bad, 0) + 1);
                    break;
                case 4 :
                    break;
                case 5 :
                    map.put(good, map.getOrDefault(good, 0) + 1);
                    break;
                case 6 :
                    map.put(good, map.getOrDefault(good, 0) + 2);
                    break;
                case 7 :
                    map.put(good, map.getOrDefault(good, 0) + 3);
                    break;
            }
        }
        
        answer.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? "R" : "T");
        answer.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? "C" : "F");
        answer.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? "J" : "M");
        answer.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? "A" : "N");
        return answer.toString();
    }
}