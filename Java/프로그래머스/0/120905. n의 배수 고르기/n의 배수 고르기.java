import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int num : numlist){
            if (num % n == 0){
                al.add(num);
            }
        }
        
        answer = al.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}