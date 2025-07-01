import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (char c : my_string.toCharArray()){
            if (Character.isDigit(c)){
                answer.add(c-'0');
            }
        }
        
        int[] ans = answer.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(ans);
        return ans;
    }
}