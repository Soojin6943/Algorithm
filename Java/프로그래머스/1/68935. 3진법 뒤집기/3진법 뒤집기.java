import java.util.*;

class Solution {
    // 반전된 3진수
    public int[] thr(int n){
        // 반전된 3진법 담을 배열
        ArrayList<Integer> result = new ArrayList<>();
        
        while (n > 2){
            result.add(n % 3);
            n = n / 3;
        }
        
        result.add(n);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 10진수
    public int ten(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[arr.length-i-1]*(Math.pow(3,i));
        }
        return sum;
    }

        
    public int solution(int n) {
        int answer = ten(thr(n));
        return answer;
    }
}