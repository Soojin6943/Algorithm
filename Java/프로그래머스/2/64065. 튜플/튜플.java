import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<int[]> list = new ArrayList<>();
        
        int start = 0;
        int end = 0;
        
        for (int i=1; i<s.length()-1; i++) {
            if (s.charAt(i) == '{') {
                start = i+1;
            } else if ( s.charAt(i) == '}') {
                end = i;
                String[] sub = s.substring(start, end).split(",");
                int[] num = new int[sub.length];
                for (int j=0; j<num.length; j++) {
                    num[j] = Integer.parseInt(sub[j]);
                }
                list.add(num);
            }
        }
        
        Collections.sort(list, (o1, o2) -> {
            return o1.length - o2.length;
        });
        
        List<Integer> result = new ArrayList<>();
        
        for (int[] in : list) {
            for (int i : in) {
                if (!result.contains(i)) {
                    result.add(i);
                    break;
                }
            }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}