import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=1; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                arr.add(i);
                if(n / i != i)
                    arr.add(n / i);
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}